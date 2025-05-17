/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guero
 */
public class SpiralMatrixTest {
    SpiralMatrix mat = new SpiralMatrix(); 
    public SpiralMatrixTest() {
        
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SpiralMatrix.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of spiralOrderrr method, of class SpiralMatrix.
     */
    @Test
    public void testSpiralOrderrr() {
         int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrix2 = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};
        
            int [][] matrix3= {   {1,2,3,4},
                                  {5,6,7,8},
                                 {9,10,11,12},
                                 {13,14,15,16},
                                 {17,18,19,20},
                                 {21,22,23,24}
            };
            assertEquals(mat.spiralOrderrr(matrix), Arrays.asList(1,2,3,6,9,8,7,4,5));
            assertEquals(mat.spiralOrderrr(matrix2), Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));
            assertEquals(mat.spiralOrderrr(matrix3),Arrays.asList(1,2,3,4,8,12,16,
                    20,24,23,22,21,17,13,9,5,6,7,11,15,19,18,14,10));
             
    }

    /**
     * Test of spiralOrder method, of class SpiralMatrix.
     */
    @Test
    public void testSpiralOrder() {
    }
    
}
