package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exceptions.TrackAlreadyExistException;
import com.stackroute.exceptions.TrackNotFoundException;
import com.stackroute.repository.TrackRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
//@Profile("dev")
@Service
@Qualifier("call")
/*  Qualifier annotation is used to resolve the autowiring conflict,
    when there are multiple beans of same type "Primary" annotation will execute
*/
public class TrackDummyServiceImplementation implements TrackService {
    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    private TrackRepository trackRepository;

    @Autowired
    public TrackDummyServiceImplementation(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistException {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return null;
    }

    @Override
    public List<Track> getAllTracks() {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return null;
    }

    @Override
    public Track getTrackById(int id) throws TrackNotFoundException {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return null;
    }

    @Override
    public Track deleteById(int id) throws TrackNotFoundException {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return null;
    }

    @Override
    public Track updateTrackbyId(int id, Track track) throws TrackNotFoundException {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return null;
    }

    @Override
    public Track searchTrackByName(String name) throws TrackNotFoundException {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return null;
    }
}
