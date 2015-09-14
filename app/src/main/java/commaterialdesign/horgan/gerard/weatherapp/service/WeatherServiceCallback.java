package commaterialdesign.horgan.gerard.weatherapp.service;


import commaterialdesign.horgan.gerard.weatherapp.data.Channel;

public interface  WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
