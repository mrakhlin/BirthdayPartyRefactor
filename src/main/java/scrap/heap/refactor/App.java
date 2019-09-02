package scrap.heap.refactor;

public class App {

    public enum Color {
    	RED,
    	BLUE,
    	YELLOW,
    	BROWN
    }

	public enum Shape {
		CIRCLE,
		SQUARE
	}

	public enum Size {
		LARGE,
		MEDIUM,
		SMALL
	}

	public enum Material {
		MYLAR,
		LATEX
	}

	public enum Flavor {
		CHOCOLATE,
		VANILLA
	}

	public enum FrostingFlavor {
		CHOCOLATE,
		VANILLA
	}

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        //Place birthday party orders
        order(Color.RED, Material.MYLAR, 4, Flavor.CHOCOLATE, FrostingFlavor.CHOCOLATE, Shape.CIRCLE, Size.LARGE, Color.BROWN);
        order(Color.BLUE, Material.LATEX, 7, Flavor.VANILLA, FrostingFlavor.CHOCOLATE, Shape.SQUARE, Size.MEDIUM, Color.BROWN); 
        order(Color.YELLOW, Material.MYLAR, 4, Flavor.VANILLA, FrostingFlavor.VANILLA, Shape.SQUARE, Size.SMALL, Color.YELLOW);
    }

    private static void order(Color balloonColor, Material material, int number, Flavor flavor, FrostingFlavor frostingFlavor, Shape shape, Size size, Color cakeColor){

        orderBalloons(balloonColor, material, number);
        orderCake(flavor, frostingFlavor, shape, size, cakeColor);
    }

    private static void orderBalloons(Color balloonColor, Material material, int number){

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloonColor + ", " + material  + ", " + number);
    }

    private static void orderCake(Flavor flavor, FrostingFlavor frostingFlavor, Shape shape, Size size, Color cakeColor){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + cakeColor);
    }
}
