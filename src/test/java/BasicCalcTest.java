import static org.junit.jupiter.api.Assertions.*;
import java.lang.Double;

class BasicCalcTest {

    @org.junit.jupiter.api.Test
    public void add() {BasicCalc add = new BasicCalc();
        assertEquals(2,BasicCalc.add(1,1));

    }
    @org.junit.jupiter.api.Test
    public void subTract() {BasicCalc subTract = new BasicCalc();
        assertEquals(10,BasicCalc.subtract(20,10));

    }
    @org.junit.jupiter.api.Test
    public void multiply() {BasicCalc multiply = new BasicCalc();
        assertEquals(200,BasicCalc.multiply(20,10));

    }
    @org.junit.jupiter.api.Test
    public void divide() {BasicCalc divide = new BasicCalc();
        assertEquals(2,BasicCalc.divide(20,10));
        //assertEquals(BasicCalc.isFinite(), BasicCalc.divide(20,0));

    }
    @org.junit.jupiter.api.Test
    public void square() {BasicCalc square = new BasicCalc();
        assertEquals(4,BasicCalc.square(2));

    }
    @org.junit.jupiter.api.Test
    public void squareRoot() {BasicCalc squareRoot = new BasicCalc();
        assertEquals(2,BasicCalc.squareRoot(4));

    }
    @org.junit.jupiter.api.Test
    public void inverse() {BasicCalc inverse = new BasicCalc();
        assertEquals(.10 ,BasicCalc.inverse(10));

    }

}