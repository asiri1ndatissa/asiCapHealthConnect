export interface HealthConnectPlugin {
  /**
   * Check if Health Connect is available (Android only)
   * Returns false on iOS and Web
   */
  isAvailable(): Promise<{ available: boolean }>;
}
