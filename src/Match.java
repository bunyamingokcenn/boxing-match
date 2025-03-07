public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {

            while (this.f1.health > 0 && this.f2.health > 0) {

                System.out.println("====YENİ ROUND====");

                int firstPunch = (int) (Math.random() * 100);

                if (firstPunch >= 50) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                }


                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);


            }

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }


    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin() {


        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı!");
            return true;
        }

        return false;
    }


}
