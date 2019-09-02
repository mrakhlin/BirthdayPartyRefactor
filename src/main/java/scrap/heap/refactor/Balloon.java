package scrap.heap.refactor;

public class Balloon {
    public enum Color {
    	RED,
    	BLUE,
    	YELLOW
    }
    
	public enum Material {
		MYLAR,
		LATEX
	}
	
	private final Color color;
	private final Material material;
	
	private Balloon(final Color color, final Material material) {
		this.color = color;
		this.material = material;
	}
	
	public static class Builder {
		private Color color;
		private Material material;
		
		public Builder setColor(final Color color) {
			this.color = color;
			return this;
		}
		
		public Builder setMaterial(final Material material) {
			this.material = material;
			return this;
		}
		
		public Balloon build() {
			return new Balloon(color, material);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Balloon: color=%s, material=%s",
				color, material);
	}
}
