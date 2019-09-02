package scrap.heap.refactor;

public class Order {
	private final Balloon balloon;
	private final int balloonNumber;
	private final Cake cake;
	
	private Order(final Balloon balloon, final int balloonNumber, final Cake cake) {
		this.balloon = balloon;
		this.balloonNumber = balloonNumber;
		this.cake = cake;
	}
	
	public static class Builder {
		private Balloon balloon;
		private int balloonNumber;
		private Cake cake;
		
		public Builder setBalloon(final Balloon balloon) {
			this.balloon = balloon;
			return this;
		}
		
		public Builder setBalloonNumber(final int balloonNumber) {
			this.balloonNumber = balloonNumber;
			return this;
		}
		
		public Builder setCake(final Cake cake) {
			this.cake = cake;
			return this;
		}
		
		public Order build() {
			return new Order(balloon, balloonNumber, cake);
		}
	}
	
	public Cake getCake() {
		return cake;
	}
	
	@Override
	public String toString() {
		return String.format("Order: balloon=%s, balloonNumber=%d, cake=%s",
				balloon.toString(), balloonNumber, cake.toString());
	}
}
