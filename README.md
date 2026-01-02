# @asiriindatissa/cap-health-connect

Capacitor 7 plugin for Android Health Connect.

## Installation

```bash
npm install @asiriindatissa/cap-health-connect
npx cap sync
```

## Requirements

- Capacitor 7.x
- Android API 28+ (Android 9.0+)
- Google Health Connect app installed on device

## API

### `isAvailable()`

Check if Health Connect is available on the device.

**Returns:** `Promise<{ available: boolean }>`

```typescript
import { HealthConnect } from "@asiriindatissa/cap-health-connect";

const result = await HealthConnect.isAvailable();
console.log("Health Connect available:", result.available);
```

**Platform Support:**

- ✅ Android: Returns `true` if Health Connect SDK is available
- ❌ iOS: Returns `false` (Health Connect is Android-only)
- ❌ Web: Returns `false`

## Android Setup

### 1. Add Health Connect dependency

The plugin automatically includes the Health Connect SDK. No additional setup required.

### 2. Add permissions to AndroidManifest.xml

Add the permissions you need to your `AndroidManifest.xml`:

```xml
<!-- Health Connect Permissions -->
<uses-permission android:name="android.permission.health.READ_STEPS"/>
<uses-permission android:name="android.permission.health.READ_DISTANCE"/>
<uses-permission android:name="android.permission.health.READ_HEART_RATE"/>
<!-- Add other permissions as needed -->
```

### 3. Verify Google Health Connect is installed

Users need to have the Google Health Connect app installed. You can direct them to install it from the Play Store if not available.

## Example Usage

```typescript
import { HealthConnect } from "@asiriindatissa/cap-health-connect";

async function checkHealthConnect() {
  try {
    const { available } = await HealthConnect.isAvailable();

    if (available) {
      console.log("Health Connect is available!");
      // Proceed with requesting permissions and accessing health data
    } else {
      console.log("Health Connect not available");
      // Guide user to install Health Connect app
    }
  } catch (error) {
    console.error("Error checking Health Connect:", error);
  }
}
```

## License

MIT

## Author

Asiri Indatissa
