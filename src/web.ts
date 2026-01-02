import { WebPlugin } from '@capacitor/core';

import type { HealthConnectPlugin } from './definitions';

export class HealthConnectWeb extends WebPlugin implements HealthConnectPlugin {
  async isAvailable(): Promise<{ available: boolean }> {
    // Health Connect is Android-only, not available on web or iOS
    return { available: false };
  }
}
