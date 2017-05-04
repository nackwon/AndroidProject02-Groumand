package kr.hkit.groumand204_02;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;


public class Menu06Fragment extends Fragment
        implements View.OnClickListener, MapView.MapViewEventListener, MapView.POIItemEventListener {


    View rootView;
    RelativeLayout mapLayout;
    MapView mMapView, mapView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_menu06, container, false);

        // /다음이 제공하는 MapView객체 생성 및 API Key 설정
        mapView = new MapView(rootView.getContext());
        mapView.setDaumMapApiKey("73fbe5956f2c93dd296396882e2b8da2");
        //xml에 선언된 map_view 레이아웃을 찾아온 후, 생성한 MapView객체 추가
        mapLayout = (RelativeLayout) rootView.findViewById(R.id.mapLayout);
        mapLayout.addView(mapView);
        mapView.setMapViewEventListener(this); // this에 MapView.MapViewEventListener 구현.
        mapView.setPOIItemEventListener(this);

        // 기본 마커 포인터
        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("Grounmad 204");
        marker.setTag(0);
        marker.setMapPoint(MapPoint.mapPointWithGeoCoord(35.859241035, 128.5989353128));
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker);

        //mapView.setCalloutBalloonAdapter(new CustomCalloutBalloonAdapter());
        // 커스텀 마커 포인터
        /*MapPOIItem customMarker = new MapPOIItem();
        customMarker.setItemName("Custom Marker");
        customMarker.setTag(1);
        customMarker.setMapPoint(MapPoint.mapPointWithGeoCoord(35.859241035, 128.5989353128));
        customMarker.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker.setCustomImageResourceId(R.mipmap.ic_map_pointer); // 마커 이미지.
        customMarker.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker);*/

        return rootView;
    }

    @Override
    public void onClick(View v) {
    }

   /* class CustomCalloutBalloonAdapter implements CalloutBalloonAdapter {
        private final View mCalloutBalloon;

        public CustomCalloutBalloonAdapter() {
            mCalloutBalloon = getActivity().getLayoutInflater().inflate(R.layout.custom_callout_balloon, null);
        }

        @Override
        public View getCalloutBalloon(MapPOIItem poiItem) {
            ((ImageView) mCalloutBalloon.findViewById(R.id.callout_balloon_bagde)).setImageResource(R.mipmap.ic_groumand204_real_logo);
            ((TextView) mCalloutBalloon.findViewById(R.id.callout_balloon_title)).setText("Grounman 204");
            ((TextView) mCalloutBalloon.findViewById(R.id.callout_balloon_context)).setText("그루망에 오신 것을 환영합니다.");
            return mCalloutBalloon;
        }

        @Override
        public View getPressedCalloutBalloon(MapPOIItem poiItem) {
            return null;
        }
    }*/

    @Override
    public void onMapViewInitialized(MapView mapView) {
        // 중심점 변경
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(35.859241035, 128.5989353128), true);

        // 줌 레벨 변경
        mapView.setZoomLevel(1, true);

        // 중심점 변경 + 줌 레벨 변경
       // mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(33.41, 126.52), 9, true);

        // 줌 인
        mapView.zoomIn(true);

        // 줌 아웃
        mapView.zoomOut(true);
    }

    @Override
    public void onMapViewCenterPointMoved(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewZoomLevelChanged(MapView mapView, int i) {

    }

    @Override
    public void onMapViewSingleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDoubleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewLongPressed(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragStarted(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragEnded(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewMoveFinished(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onPOIItemSelected(MapView mapView, MapPOIItem mapPOIItem) {

    }

    @Override
    public void onCalloutBalloonOfPOIItemTouched(MapView mapView, MapPOIItem mapPOIItem) {

    }

    @Override
    public void onCalloutBalloonOfPOIItemTouched(MapView mapView, MapPOIItem mapPOIItem, MapPOIItem.CalloutBalloonButtonType calloutBalloonButtonType) {

    }

    @Override
    public void onDraggablePOIItemMoved(MapView mapView, MapPOIItem mapPOIItem, MapPoint mapPoint) {

    }
}
