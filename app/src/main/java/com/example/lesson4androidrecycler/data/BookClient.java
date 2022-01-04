package com.example.lesson4androidrecycler.data;

import com.example.lesson4androidrecycler.model.BookModel;

import java.util.ArrayList;

public class BookClient {
    public static ArrayList<BookModel> list = new ArrayList<>();

    public static ArrayList<BookModel> getBook() {
        list.add(new BookModel("Льюис Хэмилтон", "Сэр Лью́ис Карл Дэ́видсон Хэ́милтон MBE — британский автогонщик команды «Формулы-1» «Мерседес». Семикратный чемпион мира. Хэмилтон — первый в истории гонщик «Формулы-1», одержавший 100 побед. В 2020 году он также повторил рекорд Михаэля Шумахера по количеству выигранных чемпионских титулов."));
        list.add(new BookModel("Михаэль Шумахер", "Обладатель многочисленных рекордов чемпионата мира Формулы-1: по числу побед за один сезон, быстрых кругов, а также чемпионских титулов подряд."));
        list.add(new BookModel("Себастьян Феттель", "Четырёхкратный чемпион мира серии Формула-1 — 2010, 2011, 2012 и 2013 годов, при этом становился самым молодым обладателем соответствующего количества титулов (в 2010 — самый молодой чемпион, в 2011 — самый молодой двукратный, в 2012 — самый молодой трёхкратный, в 2013 — самый молодой четырёхкратный), также трижды становился вице-чемпионом (2009, 2017, 2018) и один раз — бронзовым призёром (2015). Также установил множество достижений в категории «самый молодой» — он является самым молодым вице-чемпионом мира (2009), обладателем поул-позиции (Гран-при Италии 2008), а также являлся самым молодым участником чемпионата, набравшим очки (Гран-при США 2007 года) до сезона 2014 года, когда этот рекорд был побит российским гонщиком Даниилом Квятом. В 2010 году Феттель был признан лучшим спортсменом года в Германии[4].\n" +
                "\n" +
                "Карьеру в Формуле-1 начал тестовым пилотом в команде BMW с Гран-при Турции 2006 года. Дебют на трассе состоялся на Гран-при США 2007 года, где Феттель заменял травмированного Роберта Кубицу. Начиная с Гран-при Венгрии в сезоне 2007 и до конца 2008 года выступал за команду Toro Rosso. С 2009 по 2014 год выступал за команду «Ред Булл», затем подписал трёхлетний договор с командой «Феррари». С 2021 года — пилот «Астон Мартин».\n" +
                "\n"));
        list.add(new BookModel("Ален Прост", "Участник тринадцати чемпионатов Формулы-1. Четырёхкратный чемпион мира (1985, 1986, 1989, 1993). Четыре раза занимал второе место в чемпионате. По окончании карьеры автогонщика, создал собственную команду «Prost Grand Prix», которая просуществовала с 1997 по 2001 год, так и не добившись существенных результатов.\n" +
                "\n" +
                "Ален Прост считается одним из лучших пилотов «Формулы-1» за всю её историю. За свой аккуратный стиль пилотажа и расчётливую гоночную стратегию получил прозвище «Профессор». В своё время он установил рекорды по числу побед, лучших кругов, очков и подиумов. В 2000-е практически все его рекорды были побиты Михаэлем Шумахером, а в 2010-е - также Льюисом Хэмилтоном и Себастьяном Феттелем, таким образом, Прост остается четвёртым по большинству абсолютных показателей."));
        return list;

    }

}
