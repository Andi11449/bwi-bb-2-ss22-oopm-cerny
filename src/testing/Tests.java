package testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void testGrade() {
        int g = Main.grade(55);
        Assert.assertEquals(g, 5);
    }

    @Test(dataProvider = "test_grade_data")
    public void testGradeParameterized(int credits, int grade) {
        int g = Main.grade(credits);
        Assert.assertEquals(g, grade);
    }

    @DataProvider(name = "test_grade_data")
    public Object[][] gradeParameters() {
        return new Object[][] {
                {0, 5}, {49, 5},
                {50, 4}, {65, 4},
                {66, 3}, {80, 3},
                {81, 2}, {95, 2},
                {96, 1}, {100, 1},
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGradeException1() {
        int g = Main.grade(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGradeException2() {
        int g = Main.grade(101);
    }
}
