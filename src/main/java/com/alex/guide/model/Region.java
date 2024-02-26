package com.alex.guide.model;


/**
 *Создать приложение используя Spring Boot реализующее справочник регионов
 * (свойства: идентификатор, наименование, сокращённое наименование),
 * предоставляющее REST-API на чтение и изменение справочника,
 * справочник должен храниться в БД в качестве ORM необходимо использовать MyBatis.
 * Использовать Spring Cache для сокращения операций чтения из БД, справочник может быть достаточно большим.
 *  Использовать встроенные БД и сервер приложений.
 */
public class Region {

    private int id;
    private String name;
    private String abr;


    public Region(int id, String name, String abbreviatedName) {
        this.id = id;
        this.name = name;
        this.abr = abbreviatedName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }
}
