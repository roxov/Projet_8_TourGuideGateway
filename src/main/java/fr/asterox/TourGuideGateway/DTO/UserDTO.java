package fr.asterox.TourGuideGateway.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDTO {
	private final UUID userId;
	private final String userName;
	private String phoneNumber;
	private String emailAddress;
	private List<VisitedLocationDTO> visitedLocations = new ArrayList<>();
	private List<UserRewardDTO> userRewards = new ArrayList<>();
	private UserPreferencesDTO userPreferences = new UserPreferencesDTO();
	private List<ProviderDTO> tripDeals = new ArrayList<>();

	public UserDTO(UUID userId, String userName, String phoneNumber, String emailAddress) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public UserDTO(UUID userId, String userName, String phoneNumber, String emailAddress,
			List<VisitedLocationDTO> visitedLocations, List<UserRewardDTO> userRewards,
			UserPreferencesDTO userPreferences, List<ProviderDTO> tripDeals) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.visitedLocations = visitedLocations;
		this.userRewards = userRewards;
		this.userPreferences = userPreferences;
		this.tripDeals = tripDeals;
	}

	public UUID getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void addToVisitedLocations(VisitedLocationDTO visitedLocation) {
		visitedLocations.add(visitedLocation);
	}

	public List<VisitedLocationDTO> getVisitedLocations() {
		return visitedLocations;
	}

	public void clearVisitedLocations() {
		visitedLocations.clear();
	}

//	public void addUserReward(UserRewardDTO userReward) {
//		if (userRewards.stream().filter(r -> !r.attraction.attractionName.equals(userReward.attraction)).count() == 0) {
//			userRewards.add(userReward);
//		}
//	}

	public List<UserRewardDTO> getUserRewards() {
		return userRewards;
	}

	public UserPreferencesDTO getUserPreferences() {
		return userPreferences;
	}

	public void setUserPreferences(UserPreferencesDTO userPreferences) {
		this.userPreferences = userPreferences;
	}

	public VisitedLocationDTO getLastVisitedLocation() {
		return visitedLocations.get(visitedLocations.size() - 1);
	}

	public void setTripDeals(List<ProviderDTO> tripDeals) {
		this.tripDeals = tripDeals;
	}

	public List<ProviderDTO> getTripDeals() {
		return tripDeals;
	}

}
