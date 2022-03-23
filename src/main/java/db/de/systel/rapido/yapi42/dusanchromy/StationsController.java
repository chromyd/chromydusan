package db.de.systel.rapido.yapi42.dusanchromy;

import db.de.systel.rapido.yapi42.dusanchromy.api.StationsApi;
import db.de.systel.rapido.yapi42.dusanchromy.model.Station;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class StationsController implements StationsApi {
    @Override
    public ResponseEntity<List<Station>> getStations(Integer minimumAvailableBikes) {
        var nyCity = new Station().id(1).name("Big Apple").location(List.of(Double.valueOf(57.5),Double.valueOf(-14)));
        var la = new Station().id(1).name("LA").location(List.of(Double.valueOf(55.2),Double.valueOf(-16)));
        return ResponseEntity.ok(List.of(nyCity, la));
    }
}