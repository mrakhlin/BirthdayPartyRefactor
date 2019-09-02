package scrap.heap.refactor;

public class Cake {
    public enum Color {
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
	
	public enum Flavor {
		CHOCOLATE,
		VANILLA
	}
	
	public enum FrostingFlavor {
		CHOCOLATE,
		VANILLA
	}
	
	private final Flavor flavor;
	private final FrostingFlavor frostingFlavor;
	private final Shape shape;
	private final Size size;
	private final Color color;
	
	private Cake(final Flavor flavor, final FrostingFlavor frostingFlavor, final Shape shape, final Size size, final Color color) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.color = color;
	}
	
	public static class Builder {
		private Flavor flavor;
		private FrostingFlavor frostingFlavor;
		private Shape shape;
		private Size size;
		private Color color;
		
		public Builder setFlavor(final Flavor flavor) {
			this.flavor = flavor;
			return this;
		}
		
		public Builder setFrostingFlavor(final FrostingFlavor frostingFlavor) {
			this.frostingFlavor = frostingFlavor;
			return this;
		}
		
		public Builder setShape(final Shape shape) {
			this.shape = shape;
			return this;
		}
		
		public Builder setSize(final Size size) {
			this.size = size;
			return this;
		}
		
		public Builder setColor(final Color color) {
			this.color = color;
			return this;
		}
		
		public Cake build() {
			return new Cake(flavor, frostingFlavor, shape, size, color);
		}
	}
	
	public Color getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return String.format("Cake: flavor=%s, frostingFlavor=%s, shape=%s, size=%s, color=%s",
				flavor, frostingFlavor, shape, size, color);
	}
}
