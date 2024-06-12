package com.example.quotesapp;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {

    public static List<QuotesList> getLifeQuotes() {
        final  List<QuotesList> lifeQuotesList = new ArrayList<>();

        QuotesList lifeQuotel= new QuotesList("Life is a mountain. Your goal is to find your path, not to reach the top.", "Maxime Lagacé");
        lifeQuotesList.add(lifeQuotel);
        QuotesList lifeQuote2 =new QuotesList("Three things in life your health, your mission, and the people you love. That's it", "Naval Ravikant");
        lifeQuotesList.add(lifeQuote2);
        QuotesList lifeQuote3 = new QuotesList( "Life is from the inside out. When you shift on the inside, life shifts on the outside.", "Kamal Ravika");
        lifeQuotesList.add(lifeQuote3);
        QuotesList lifeQuote4 =new QuotesList("If you spend too much time thinking about a thing, you'll never get it done.", "Bruce Lee");
        lifeQuotesList.add(lifeQuote4);


        return lifeQuotesList;
    }
    public static List<QuotesList> getMotivationQuotes() {
        final List<QuotesList> motivationQuotesList = new ArrayList<>();
        QuotesList motivationQuotel = new QuotesList("I wasn't there to compete, I was there to win.", "Arnold Schwarzenegger");
        motivationQuotesList.add(motivationQuotel);
        QuotesList motivationQuote2 = new QuotesList("Someone once told me growth and comfort do not coexist,", "Ginni Rometty");
        motivationQuotesList.add(motivationQuote2);

        QuotesList motivationQuote3 = new QuotesList("All the power is within you, You can do anything.", "Swami Vivekananda");
        motivationQuotesList.add(motivationQuote3);

        QuotesList motivationQuote4 = new QuotesList("The place between your comfort zone and your dream is where life takes place.", "Helen Keller ");
        motivationQuotesList.add(motivationQuote4);

        return motivationQuotesList;
    }
    public static List<QuotesList> getLoveQuotes() {
        final List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuote1 = new QuotesList("love quote 1","gaurav");
        loveQuotesList.add(loveQuote1);
        return loveQuotesList;
    }

    public static List<QuotesList> getSuccessQuotes(){

        final List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuote1 = new QuotesList("Success Quote 1", "Gaurav");
        loveQuotesList.add(loveQuote1);
        return loveQuotesList;
    }
    public static List<QuotesList> getEnglishQuotes(){

        final List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuote1= new QuotesList("English Quote 1", "Gaurav");

        loveQuotesList.add(loveQuote1);


        return loveQuotesList;

    }
}
