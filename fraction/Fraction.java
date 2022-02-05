package fraction;

class Fraction {
    private int top, bot;
    int topre = 0;
    int botre = 0;

    Fraction(int top, int bot) {
        if (bot != 0) {
            this.top = top;
            this.bot = bot;
            if (top < 0 && bot < 0) {
                top *= -1;
                bot *= -1;
            }
        }
    }

    Fraction(int top) {
        this.top = top;
        this.bot = 1;
    }

    public int getBot() {
        return bot;
    }

    public int getTop() {
        return top;
    }

    public String toString() {
        if (top == 0 && bot == 0) {
            return "Can't find value";
        }
        return top + "/" + bot;

    }

    public Fraction add(Fraction x) {
        if (bot != x.getBot()) {
            botre = bot * x.getBot();
            topre += (top * x.getBot());
            topre += (x.getTop() * bot);
            return new Fraction(topre, botre);
        } else {
            topre = top + x.getTop();
            botre = bot;
            return new Fraction(topre, botre);
        }
    }

    public Fraction subtract(Fraction x) {
        if (bot != x.getBot()) {
            botre = bot * x.getBot();
            topre += (top * x.getBot() - (x.getTop() * bot));

            return new Fraction(topre, botre);
        } else {
            topre = top + x.getTop();
            botre = bot;
            return new Fraction(topre, botre);
        }
    }

    public Fraction multiply(Fraction x) {
        if (((top < 0 && x.getBot() < 0)) || ((bot < 0 && x.getTop() < 0))) {
            botre = bot * x.getBot();
            topre = top * x.getTop();
            topre *= -1;
            botre *= -1;
            return new Fraction(topre, botre);
        } else {
            botre = bot * x.getBot();
            topre = top * x.getTop();
            return new Fraction(topre, botre);
        }
    }

    public Fraction divide(Fraction x) {
        if ((top < 0 && x.getTop() < 0) || (x.getBot() < 0 && bot < 0)) {

            botre = bot * x.getTop();
            topre = top * x.getBot();

            return new Fraction(topre, botre);
        } else {
            botre = bot * x.getTop();
            topre = top * x.getBot();
            return new Fraction(topre, botre);
        }
    }

    public void reduce() {
        if (bot % top == 0) {
            this.bot /= this.top;
            this.top /= this.top;
        } else if (top % bot == 0) {
            this.top /= this.bot;
            this.bot /= this.bot;
        } else {
            if (this.top > this.bot) {
                for (int i = 1; i < this.bot; i++) {
                    if (this.top % i == 0 && this.bot % i == 0) {
                        this.top /= i;
                        this.bot /= i;
                    }
                }
            } else {
                for (int i = 1; i < top; i++) {
                    if (this.top % i == 0 && this.bot % i == 0) {
                        this.top /= i;
                        this.bot /= i;
                    }
                }
            }
        }
    }

}