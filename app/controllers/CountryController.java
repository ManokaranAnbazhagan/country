package controllers;

import data.CountryClient;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class CountryController extends Controller {
    @Inject
    private CountryClient client;

    public Result getData() {
        return ok(client.getCountrymap().toString());
    }
}
