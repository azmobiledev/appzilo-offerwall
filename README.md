## Appzilo Offerwall
Appzilo offerwall for Android support API 17 and above.

## Installation
Add the following to your Project `build.gradle` file:

```
repositories {
	jcenter()
}
```

Add the following dependency to your app's `build.gradle` file:

```
dependencies {
	compile 'com.appzilo.sdk:offerwall:1.+'
}
```

## Usage

Initialize sdk

```
Offerwall.initApp(this, "APP_KEY", "UNIQUE_USER_ID");
Offerwall.show();
```

Passing custom parameters (SUB_ID, SUB_ID2, SUB_ID3, SUB_ID4, SUB_ID5)

```
HashMap<String, String> params = new HashMap<>();
params.put(Offerwall.SUB_ID, "XXXX");
params.put(Offerwall.SUB_ID2, "YYYY");
Offerwall.initApp(this, "APP_KEY", "UNIQUE_USER_ID", params);
Offerwall.show();
```

## Permissions

We include the [INTERNET](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) and [ACCESS_NETWORK_STATE](https://developer.android.com/reference/android/Manifest.permission.html#ACCESS_NETWORK_STATE) permissions by default as we need it to make network requests and check if the network is available:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```  





