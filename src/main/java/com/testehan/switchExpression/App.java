package com.testehan.switchExpression;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Day today = Day.WEDNESDAY;

        int numLetters = switch (today) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };

        System.out.println(numLetters);

        int result = switch ("abc") {
            case "Foo" -> 1;
            case "Bar" -> 2;
            default -> {
                System.out.println("Neither Foo nor Bar, hmmm...");
                yield 1000;     // this was introduced in jdk 14, as remember, in jdk 12 this new switch was in PREVIEW
            }
        };
        System.out.println(result);
    }
}
