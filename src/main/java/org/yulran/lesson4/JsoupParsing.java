package org.yulran.lesson4;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupParsing {
    private static final String url = "https://zno.osvita.ua/";

    public static void main(String[] args) throws IOException {


        try {

            Document document = Jsoup.connect(url).get();
          //вывод главного названия на странице
            Elements headings = document.select("#header > div.title-block");
            for (Element heading : headings) {
                System.out.println(heading.text()+"\n");

                //вывод тестов на странице и их адреса для перехода на них
            Elements links = document.select(".test-item");


            for (Element link : links) {
                // текст ссылки(название предмета)
                String linkText = link.text();
                //  адрес ссылки
                String linkHref = link.attr("href");


                System.out.println("Текст ссылки: " + linkText);
                System.out.println("Адрес ссылки: " + linkHref);

            }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



