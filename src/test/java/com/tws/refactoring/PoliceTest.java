package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliceTest {

  @Test
  public void should_get_true_when_driver_age_more_than_18(){
    //given
    Police police = new Police();
    Driver driver = new Driver(19);
    //when
    boolean actual = police.checkDriver(driver);
    //then
    Assertions.assertEquals(true,actual);
  }
  @Test
  public void should_get_true_when_driver_age_is_18(){
    //given
    Police police = new Police();
    Driver driver = new Driver(18);
    //when
    boolean actual = police.checkDriver(driver);
    //then
    Assertions.assertEquals(true,actual);
  }
  @Test
  public void should_get_true_when_driver_age_less_than_18(){
    //given
    Police police = new Police();
    Driver driver = new Driver(17);
    //when
    boolean actual = police.checkDriver(driver);
    //then
    Assertions.assertEquals(false,actual);
  }
}
