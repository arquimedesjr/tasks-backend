package br.ce.wcaquino.taskbackend.util;

import br.ce.wcaquino.taskbackend.utils.DateUtils;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DataUtilsTests {
    @Test
    public void deveRetornarTrue(){
        LocalDate date = LocalDate.of(2030,01,01);
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarFalse(){
        LocalDate date = LocalDate.of(2010,01,01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarTrueParaDataAtual(){
        LocalDate date = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}
