class run{
	public static void main(String[] args) {
		box<square> b = new box<square>(new square(5));
		System.out.println(b.getStored());
	}
}