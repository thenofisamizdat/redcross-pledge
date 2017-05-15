package com.redcross.pledge.cucumber.stepdefs;

import com.redcross.pledge.PledgemasterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PledgemasterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
