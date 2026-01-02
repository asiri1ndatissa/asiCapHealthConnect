import { WebPlugin } from '@capacitor/core';
import type { HealthConnectPlugin } from './definitions';
export declare class HealthConnectWeb extends WebPlugin implements HealthConnectPlugin {
    isAvailable(): Promise<{
        available: boolean;
    }>;
}
//# sourceMappingURL=web.d.ts.map