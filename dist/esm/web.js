import { WebPlugin } from '@capacitor/core';
export class HealthConnectWeb extends WebPlugin {
    async isAvailable() {
        // Health Connect is Android-only, not available on web or iOS
        return { available: false };
    }
}
//# sourceMappingURL=web.js.map