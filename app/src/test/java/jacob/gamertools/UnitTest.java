package jacob.gamertools;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Small_Increase_Sets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        variables.setSmall_decrease(5);
        assert(variables.small_decrease==5);
    }

    @Test
    public void Small_Decrease_Sets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        variables.setSmall_decrease(5);
        assert(variables.small_decrease==5);
    }

    @Test
    public void Large_Increase_Sets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        variables.setSmall_decrease(5);
        assert(variables.small_decrease==5);
    }

    @Test
    public void Large_Decrease_Sets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        variables.setSmall_decrease(5);
        assert(variables.small_decrease==5);
    }

    @Test
    public void Small_Increase_Gets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        assert(variables.getSmall_increase()==1);
    }

    @Test
    public void Small_Decrease_Gets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        assert(variables.getSmall_decrease()==1);
    }

    @Test
    public void Large_Increase_Gets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        assert(variables.getLarge_increase()==10);
    }

    @Test
    public void Large_Decrease_Gets() throws Exception
    {
        Global_Variables variables= new Global_Variables();
        assert(variables.getLarge_decrease()==10);
    }

    @Test
    public void Small_Increase_Set_Get_Fails() {

        Global_Variables variables = new Global_Variables();
        variables.setSmall_increase(5);
        assertNotEquals(variables.getSmall_increase(),10);
    }
}