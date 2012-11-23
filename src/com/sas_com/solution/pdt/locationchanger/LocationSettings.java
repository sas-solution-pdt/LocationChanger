package com.sas_com.solution.pdt.locationchanger;

import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class LocationSettings extends MapActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationsettings);
        
        final MapView mapView = (MapView)findViewById(R.id.mapview);
        
        MapController mapController = mapView.getController();
        GeoPoint centerPoint = new GeoPoint((int)(35.646772*1E6),(int)(139.743881*1E6));
        mapController.setCenter(centerPoint);
        mapController.setZoom(20);
        
        mapView.setClickable(true);
        
        mapView.setBuiltInZoomControls(true);
        mapView.setSatellite(false);
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
