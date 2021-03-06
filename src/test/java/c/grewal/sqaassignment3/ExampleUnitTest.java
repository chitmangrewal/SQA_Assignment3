package c.grewal.sqaassignment3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


        //Member variable
        MainActivity c;

        @Before
        public void setUp() throws Exception {

            //Initialized member variable
            c = new MainActivity();
        }

        // TEST CASES FOR ADDITION

        @Test
        // Test Identifier: 1.1
        // Test Description: Adding 5 and 5 (2 positive numbers)
        // Method of Execution: Automated
        // Input Data: 5,5
        // Expected Output: 10.0
        // Observed Output: 10.0

        public void testAddition_input5and5_output10() throws Exception {
            // 1. Arrange
            double i = 5;
            double j = 5;

            // 2. Act
            double result = c.addition(i, j);

            // 3. Assert
            assertEquals(10.0, result,1);
        }

        @Test
        // Test Identifier: 1.2
        // Test Description: Adding 0 and 5
        // Method of Execution: Automated
        // Input Data: 0,5
        // Expected Output: 5.0


        public void testAddition_input0and5_output5() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = 5;

            // 2. Act
            double result = c.addition(i, j);

            // 3. Assert
            assertEquals(5.0, result,1);
        }



        @Test
        // Test Identifier: 1.3
        // Test Description: Adding 1.0 and -2.7 (adding 2 float numbers)
        // Method of Execution: Automated
        // Input Data: 1.0, -2.7
        // Expected Output: -1.7.0

        public void testAddition_oneAndNegativeTwoPointSeven_negativeOnePointSeven() throws Exception {
            // 1. Arrange
            double i = 1.0;
            double j = -2.7;

            // 2. Act
            double result = c.addition(i, j);

            // 3. Assert
            assertEquals(-1.7, result, 1);
        }



        // TEST CASES FOR SUBTRACTION

        @Test
        // Test Identifier: 2.1
        // Test Description: Subtracting 10 from 8 (2 positive numbers)
        // Method of Execution: Automated
        // Input Data: 10,8
        // Expected Output: 2.0

        public void testSubtraction_10and8_2() throws Exception {
            // 1. Arrange
            double i = 10;
            double j = 8;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(2.0, result,1);
        }

        @Test
        // Test Identifier: 2.2
        // Test Description: Subtracting -12 from -5 (2 negative numbers)
        // Method of Execution: Automated
        // Input Data: -12,-5
        // Expected Output: -7.0

        public void testSubtraction_negative12And5_negative7() throws Exception {
            // 1. Arrange
            double i = -12;
            double j = -5;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(-7.0, result,1);
        }

        @Test
        // Test Identifier: 2.3
        // Test Description: Subtracting 0 from 0
        // Method of Execution: Automated
        // Input Data: 0,0
        // Expected Output: 0.0

        public void testSubtraction_0and0_0() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = 0;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(0.0, result,1);
        }



        // TEST CASES FOR MULTIPLICATION

        @Test
        // Test Identifier: 3.1
        // Test Description: Multiplying 200 by 2
        // Method of Execution: Automated
        // Input Data: 200,2
        // Expected Output: 400.0

        public void testMultiplication_200And2_400() throws Exception {
            // 1. Arrange
            double i = 200;
            double j = 2;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(400.0, result,1);
        }

        @Test
        // Test Identifier: 3.2
        // Test Description: Multiplying -15 by -3
        // Method of Execution: Automated
        // Input Data: -15,-3
        // Expected Output: 45.0

        public void testMultiplication_Negative15_Negative3_Positive45() throws Exception {
            // 1. Arrange
            double i = -15;
            double j = -3;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(45.0, result,1);
        }

        @Test
        // Test Identifier: 3.3
        // Test Description: Multiplying 0 by -1
        // Method of Execution: Automated
        // Input Data: 0,-1
        // Expected Output: 0.0

        public void testMultiplication_0AndNegative1_0() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = -1;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(0.0, result,1);
        }


        // TEST CASES FOR DIVISION

    @Test
    // Test Identifier: 4.1
    // Test Description: Dividing 20 by 5
    // Method of Execution: Automated
    // Input Data: 20,5
    // Expected Output: 0

    public void testDivision_1and1_1() throws Exception {
        // 1. Arrange
        double i = 1;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(1.0, result,1);
    }


    @Test
    // Test Identifier: 4.2
    // Test Description: Dividing 0 by 3
    // Method of Execution: Automated
    // Input Data: 0,3
    // Expected Output: 0.0

    public void testDivision_2And1_2() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.0, result,1);
    }


    @Test
    // Test Identifier: 4.3
    // Test Description: Dividing -25 by -10
    // Method of Execution: Automated
    // Input Data: -25,-10
    // Expected Output: 2.5

    public void testDivision_9and3_3() {
        // 1. Arrange
        double i = 9;
        double j = 3;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(3, result,1);
    }

}
