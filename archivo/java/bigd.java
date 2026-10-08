package com.analisis.bigdata;

import org.apache.spark.sql.*;
import static org.apache.spark.sql.functions.*;

public class Main {
    public static void main(String[] args) {
        // Crear la sesión de Spark
        SparkSession spark = SparkSession.builder()
                .appName("AnalisisBigData")
                .master("local[*]")
                .getOrCreate();

        // Simular un conjunto de datos grande (puedes cargar CSV también)
        Dataset<Row> datos = spark.read().json("data/usuarios.json");

        // Mostrar datos
        System.out.println("Datos originales:");
        datos.show();

        // Análisis: contar usuarios por país
        Dataset<Row> usuariosPorPais = datos.groupBy("pais")
                                            .agg(count("*").alias("total_usuarios"))
                                            .orderBy(desc("total_usuarios"));

        System.out.println("Usuarios por país:");
        usuariosPorPais.show();

        // Promedio de edad por país
        Dataset<Row> edadPromedio = datos.groupBy("pais")
                                         .agg(avg("edad").alias("edad_promedio"))
                                         .orderBy(desc("edad_promedio"));

        System.out.println("Edad promedio por país:");
        edadPromedio.show();

        // Filtrar usuarios mayores de 40
        Dataset<Row> mayoresDe40 = datos.filter(col("edad").gt(40));

        System.out.println("Usuarios mayores de 40:");
        mayoresDe40.show();

        // Detener Spark
        spark.stop();
    }
}
