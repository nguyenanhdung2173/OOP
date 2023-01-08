package designpattern.lab13.builder.excercise2;

public class PizzaDirection {
    public static void main(String[] args) {
        PizzaBuilder veggieBuilder = new VeggiePizzaBuilder();

        Pizza veggie = veggieBuilder.addSauce().addCheese().addOlives().addTomatoes().addSausage().build();
        veggie.prepare();
        veggie.bake();
        veggie.cut();
        veggie.box();
        System.out.println(veggie);

        PizzaBuilder meatBuilder = new MeatPizzaBuilder();
        Pizza meat = meatBuilder.addSauce().addTomatoes().addCheese().addSausage().addPepperoni().build();
        meat.prepare();
        meat.bake();
        meat.cut();
        meat.box();
        System.out.println(meat);


        StringBuilder sb = new StringBuilder();
        sb.append("\nTesting String Builder\n").append(veggie).insert(0, "====");
        System.out.println("Length of the String Builder: " + sb.length());
        System.out.println("Result of the String Builder: " + sb.toString());

        String sb2 = new StringBuilder().append("\nTesting String Builder\n").append(meat).insert(0, "====").toString();
        System.out.println(sb2);

    }
}
