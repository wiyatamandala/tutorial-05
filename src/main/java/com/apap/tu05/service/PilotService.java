package com.apap.tu05.service;

import com.apap.tu05.model.PilotModel;

/**
 * PilotService
 */
public interface PilotService {
    PilotModel getPilotDetailBylicenseNumber(String licenseNumber);
    void addPilot(PilotModel pilot);
	void deletePilot(Long id);
	void updatePilot(PilotModel pilot, String licenseNumber);
}