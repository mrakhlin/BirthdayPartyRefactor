package scrap.heap.refactor;

public class App {
	public String getGreeting() {
        return "Hello world.";
    }
	
    public static void main(String[] args) {

    	//Place birthday party orders
        //order(Color.RED, Material.MYLAR, 4, Flavor.CHOCOLATE, FrostingFlavor.CHOCOLATE, Shape.CIRCLE, Size.LARGE, Color.BROWN);
        //order(Color.BLUE, Material.LATEX, 7, Flavor.VANILLA, FrostingFlavor.CHOCOLATE, Shape.SQUARE, Size.MEDIUM, Color.BROWN); 
        //order(Color.YELLOW, Material.MYLAR, 4, Flavor.VANILLA, FrostingFlavor.VANILLA, Shape.SQUARE, Size.SMALL, Color.YELLOW);
    	
    	System.out.println(
    	    	new Order.Builder()
    	    		.setBalloon(new Balloon.Builder()
    	    					.setColor(Balloon.Color.RED)
    	    					.setMaterial(Balloon.Material.MYLAR)
    	    					.build())
    	    		.setBalloonNumber(4)
    	    		.setCake(new Cake.Builder()
    	    				.setFlavor(Cake.Flavor.CHOCOLATE)
    	    				.setFrostingFlavor(Cake.FrostingFlavor.CHOCOLATE)
    	    				.setShape(Cake.Shape.CIRCLE)
    	    				.setSize(Cake.Size.LARGE)
    	    				.setColor(Cake.Color.BROWN)
    	    				.build())
    	    		.build().toString()
    	    		);

    	System.out.println(
    	    	new Order.Builder()
    	    		.setBalloon(new Balloon.Builder()
    	    					.setColor(Balloon.Color.BLUE)
    	    					.setMaterial(Balloon.Material.LATEX)
    	    					.build())
    	    		.setBalloonNumber(7)
    	    		.setCake(new Cake.Builder()
    	    				.setFlavor(Cake.Flavor.VANILLA)
    	    				.setFrostingFlavor(Cake.FrostingFlavor.CHOCOLATE)
    	    				.setShape(Cake.Shape.SQUARE)
    	    				.setSize(Cake.Size.MEDIUM)
    	    				.setColor(Cake.Color.BROWN)
    	    				.build())
    	    		.build().toString()
    	    		);

    	System.out.println(
    	    	new Order.Builder()
    	    		.setBalloon(new Balloon.Builder()
    	    					.setColor(Balloon.Color.YELLOW)
    	    					.setMaterial(Balloon.Material.MYLAR)
    	    					.build())
    	    		.setBalloonNumber(4)
    	    		.setCake(new Cake.Builder()
    	    				.setFlavor(Cake.Flavor.VANILLA)
    	    				.setFrostingFlavor(Cake.FrostingFlavor.VANILLA)
    	    				.setShape(Cake.Shape.SQUARE)
    	    				.setSize(Cake.Size.SMALL)
    	    				.setColor(Cake.Color.YELLOW)
    	    				.build())
    	    		.build().toString()
    	    		);
    }
}
