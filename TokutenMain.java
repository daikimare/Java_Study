class TokutenMain {
  public static void main(String args[]) {
    Tokuten jukensei = new Tokuten();
    jukensei.setData("Hanako", 90, 75, 85);
    jukensei.show();
  }
}

class Tokuten {
  String name;
  int eng, math, kok;

  void setData(String n, int e, int m, int k) {
    name = n;
    eng = e;
    math = m;
    kok = k;
  }

  void show() {
    System.out.println(name + ":英" + eng + ":数" + math + ":国" + kok);
  }
}