import affirmation.Implication;
import affirmation.Mensonge;
import affirmation.Verite;
import lombok.Getter;
import lombok.Setter;
import operationdesLogiques.Donc;
import operationdesLogiques.Et;
import operationdesLogiques.Ou;

@Getter
@Setter

public class CalculusRatio {
    public static void main(String[] args) {
        Verite verite1 = new Verite("Lou est beau");
        Mensonge mensonge1 = new Mensonge("Lou est pauvre");
        Implication affirmation1 = new Implication("Lou est généreux");


        Et etOperation = new Et(mensonge1.getValeur(), affirmation1.getValeur());
        System.out.println("Lou est pauvre et Lou est généreux: " + etOperation.evaluer());
        // d apres ce que dit le sujet , ça devrait être faux

        Donc doncOperation1 = new Donc(verite1.getValeur(), mensonge1.getValeur());
        System.out.println("Lou est beau. Donc Lou est pauvre: " + doncOperation1.evaluer());

        Donc doncOperation2 = new Donc(mensonge1.getValeur(), affirmation1.getValeur());
        System.out.println("Lou est pauvre. Donc Lou est généreux: " + doncOperation2.evaluer());

        Ou ouOperation1 = new Ou(verite1.getValeur(), affirmation1.getValeur());
        Donc doncOperation3 = new Donc(ouOperation1.evaluer().equals("vrai"), mensonge1.getValeur());
        System.out.println("Lou est beau ou Lou est généreux. Donc Lou est pauvre: " + doncOperation3.evaluer());

        Ou ouOperation2 = new Ou(mensonge1.getValeur(), affirmation1.getValeur());
        Et etOperation2 = new Et(doncOperation3.evaluer().equals("vrai"), ouOperation2.evaluer().equals("vrai"));
        System.out.println("Premièrement : « Lou est beau ou Lou est généreux. Donc Lou est pauvre. » " +
                "Et deuxièment : Lou est pauvre ou Lou est généreux: " + etOperation2.evaluer());
    }
}
