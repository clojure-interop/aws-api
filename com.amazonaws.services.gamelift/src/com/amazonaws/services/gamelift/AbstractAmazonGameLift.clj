(ns com.amazonaws.services.gamelift.AbstractAmazonGameLift
  "Abstract implementation of AmazonGameLift. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.gamelift AbstractAmazonGameLift]))

(defn describe-fleet-utilization
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest`

  returns: Result of the DescribeFleetUtilization operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult`"
  (^com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest request]
    (-> this (.describeFleetUtilization request))))

(defn describe-runtime-configuration
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest`

  returns: Result of the DescribeRuntimeConfiguration operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult`"
  (^com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest request]
    (-> this (.describeRuntimeConfiguration request))))

(defn update-fleet-attributes
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest`

  returns: Result of the UpdateFleetAttributes operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult`"
  (^com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest request]
    (-> this (.updateFleetAttributes request))))

(defn describe-game-session-details
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest`

  returns: Result of the DescribeGameSessionDetails operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest request]
    (-> this (.describeGameSessionDetails request))))

(defn delete-fleet
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteFleetResult`"
  (^com.amazonaws.services.gamelift.model.DeleteFleetResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn start-game-session-placement
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest`

  returns: Result of the StartGameSessionPlacement operation returned by the service. - `com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult`"
  (^com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest request]
    (-> this (.startGameSessionPlacement request))))

(defn update-fleet-port-settings
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest`

  returns: Result of the UpdateFleetPortSettings operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult`"
  (^com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest request]
    (-> this (.updateFleetPortSettings request))))

(defn search-game-sessions
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.SearchGameSessionsRequest`

  returns: Result of the SearchGameSessions operation returned by the service. - `com.amazonaws.services.gamelift.model.SearchGameSessionsResult`"
  (^com.amazonaws.services.gamelift.model.SearchGameSessionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.SearchGameSessionsRequest request]
    (-> this (.searchGameSessions request))))

(defn set-region
  "Description copied from interface: AmazonGameLift

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonGameLift this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn validate-matchmaking-rule-set
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest`

  returns: Result of the ValidateMatchmakingRuleSet operation returned by the service. - `com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult`"
  (^com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest request]
    (-> this (.validateMatchmakingRuleSet request))))

(defn accept-match
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.AcceptMatchRequest`

  returns: Result of the AcceptMatch operation returned by the service. - `com.amazonaws.services.gamelift.model.AcceptMatchResult`"
  (^com.amazonaws.services.gamelift.model.AcceptMatchResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.AcceptMatchRequest request]
    (-> this (.acceptMatch request))))

(defn create-matchmaking-configuration
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest`

  returns: Result of the CreateMatchmakingConfiguration operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult`"
  (^com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest request]
    (-> this (.createMatchmakingConfiguration request))))

(defn describe-game-session-queues
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest`

  returns: Result of the DescribeGameSessionQueues operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult`"
  (^com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest request]
    (-> this (.describeGameSessionQueues request))))

(defn describe-vpc-peering-connections
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest`

  returns: Result of the DescribeVpcPeeringConnections operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest request]
    (-> this (.describeVpcPeeringConnections request))))

(defn delete-scaling-policy
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest`

  returns: Result of the DeleteScalingPolicy operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult`"
  (^com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest request]
    (-> this (.deleteScalingPolicy request))))

(defn describe-scaling-policies
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest`

  returns: Result of the DescribeScalingPolicies operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult`"
  (^com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest request]
    (-> this (.describeScalingPolicies request))))

(defn describe-game-sessions
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest`

  returns: Result of the DescribeGameSessions operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeGameSessionsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeGameSessionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest request]
    (-> this (.describeGameSessions request))))

(defn describe-alias
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeAliasRequest`

  returns: Result of the DescribeAlias operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeAliasResult`"
  (^com.amazonaws.services.gamelift.model.DescribeAliasResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeAliasRequest request]
    (-> this (.describeAlias request))))

(defn create-fleet
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateFleetResult`"
  (^com.amazonaws.services.gamelift.model.CreateFleetResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn create-alias
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateAliasResult`"
  (^com.amazonaws.services.gamelift.model.CreateAliasResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn describe-vpc-peering-authorizations
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest`

  returns: Result of the DescribeVpcPeeringAuthorizations operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest request]
    (-> this (.describeVpcPeeringAuthorizations request))))

(defn delete-build
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteBuildRequest`

  returns: Result of the DeleteBuild operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteBuildResult`"
  (^com.amazonaws.services.gamelift.model.DeleteBuildResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteBuildRequest request]
    (-> this (.deleteBuild request))))

(defn delete-alias
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteAliasResult`"
  (^com.amazonaws.services.gamelift.model.DeleteAliasResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn update-fleet-capacity
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest`

  returns: Result of the UpdateFleetCapacity operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult`"
  (^com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest request]
    (-> this (.updateFleetCapacity request))))

(defn update-game-session-queue
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest`

  returns: Result of the UpdateGameSessionQueue operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult`"
  (^com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest request]
    (-> this (.updateGameSessionQueue request))))

(defn create-vpc-peering-connection
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest`

  returns: Result of the CreateVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult`"
  (^com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest request]
    (-> this (.createVpcPeeringConnection request))))

(defn create-script
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.CreateScriptRequest`

  returns: Result of the CreateScript operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateScriptResult`"
  (^com.amazonaws.services.gamelift.model.CreateScriptResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateScriptRequest request]
    (-> this (.createScript request))))

(defn start-match-backfill
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StartMatchBackfillRequest`

  returns: Result of the StartMatchBackfill operation returned by the service. - `com.amazonaws.services.gamelift.model.StartMatchBackfillResult`"
  (^com.amazonaws.services.gamelift.model.StartMatchBackfillResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StartMatchBackfillRequest request]
    (-> this (.startMatchBackfill request))))

(defn start-fleet-actions
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.StartFleetActionsRequest`

  returns: Result of the StartFleetActions operation returned by the service. - `com.amazonaws.services.gamelift.model.StartFleetActionsResult`"
  (^com.amazonaws.services.gamelift.model.StartFleetActionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StartFleetActionsRequest request]
    (-> this (.startFleetActions request))))

(defn describe-fleet-attributes
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest`

  returns: Result of the DescribeFleetAttributes operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult`"
  (^com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest request]
    (-> this (.describeFleetAttributes request))))

(defn create-build
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateBuildRequest`

  returns: Result of the CreateBuild operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateBuildResult`"
  (^com.amazonaws.services.gamelift.model.CreateBuildResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateBuildRequest request]
    (-> this (.createBuild request))))

(defn create-vpc-peering-authorization
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest`

  returns: Result of the CreateVpcPeeringAuthorization operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult`"
  (^com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest request]
    (-> this (.createVpcPeeringAuthorization request))))

(defn update-runtime-configuration
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest`

  returns: Result of the UpdateRuntimeConfiguration operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult`"
  (^com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest request]
    (-> this (.updateRuntimeConfiguration request))))

(defn shutdown
  "Description copied from interface: AmazonGameLift"
  ([^AbstractAmazonGameLift this]
    (-> this (.shutdown))))

(defn describe-fleet-capacity
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest`

  returns: Result of the DescribeFleetCapacity operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult`"
  (^com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest request]
    (-> this (.describeFleetCapacity request))))

(defn update-game-session
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateGameSessionRequest`

  returns: Result of the UpdateGameSession operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateGameSessionResult`"
  (^com.amazonaws.services.gamelift.model.UpdateGameSessionResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateGameSessionRequest request]
    (-> this (.updateGameSession request))))

(defn stop-game-session-placement
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest`

  returns: Result of the StopGameSessionPlacement operation returned by the service. - `com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult`"
  (^com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest request]
    (-> this (.stopGameSessionPlacement request))))

(defn list-scripts
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.ListScriptsRequest`

  returns: Result of the ListScripts operation returned by the service. - `com.amazonaws.services.gamelift.model.ListScriptsResult`"
  (^com.amazonaws.services.gamelift.model.ListScriptsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.ListScriptsRequest request]
    (-> this (.listScripts request))))

(defn create-game-session
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateGameSessionRequest`

  returns: Result of the CreateGameSession operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateGameSessionResult`"
  (^com.amazonaws.services.gamelift.model.CreateGameSessionResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateGameSessionRequest request]
    (-> this (.createGameSession request))))

(defn stop-matchmaking
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StopMatchmakingRequest`

  returns: Result of the StopMatchmaking operation returned by the service. - `com.amazonaws.services.gamelift.model.StopMatchmakingResult`"
  (^com.amazonaws.services.gamelift.model.StopMatchmakingResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StopMatchmakingRequest request]
    (-> this (.stopMatchmaking request))))

(defn get-game-session-log-url
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest`

  returns: Result of the GetGameSessionLogUrl operation returned by the service. - `com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult`"
  (^com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest request]
    (-> this (.getGameSessionLogUrl request))))

(defn update-alias
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateAliasRequest`

  returns: Result of the UpdateAlias operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateAliasResult`"
  (^com.amazonaws.services.gamelift.model.UpdateAliasResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateAliasRequest request]
    (-> this (.updateAlias request))))

(defn set-endpoint
  "Description copied from interface: AmazonGameLift

  endpoint - The endpoint (ex: \"gamelift.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://gamelift.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonGameLift this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-matchmaking
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest`

  returns: Result of the DescribeMatchmaking operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingResult`"
  (^com.amazonaws.services.gamelift.model.DescribeMatchmakingResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest request]
    (-> this (.describeMatchmaking request))))

(defn describe-matchmaking-configurations
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest`

  returns: Result of the DescribeMatchmakingConfigurations operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest request]
    (-> this (.describeMatchmakingConfigurations request))))

(defn delete-vpc-peering-authorization
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest`

  returns: Result of the DeleteVpcPeeringAuthorization operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult`"
  (^com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest request]
    (-> this (.deleteVpcPeeringAuthorization request))))

(defn get-instance-access
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.GetInstanceAccessRequest`

  returns: Result of the GetInstanceAccess operation returned by the service. - `com.amazonaws.services.gamelift.model.GetInstanceAccessResult`"
  (^com.amazonaws.services.gamelift.model.GetInstanceAccessResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.GetInstanceAccessRequest request]
    (-> this (.getInstanceAccess request))))

(defn describe-matchmaking-rule-sets
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest`

  returns: Result of the DescribeMatchmakingRuleSets operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest request]
    (-> this (.describeMatchmakingRuleSets request))))

(defn request-upload-credentials
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest`

  returns: Result of the RequestUploadCredentials operation returned by the service. - `com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult`"
  (^com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest request]
    (-> this (.requestUploadCredentials request))))

(defn describe-instances
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeInstancesRequest`

  returns: Result of the DescribeInstances operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeInstancesResult`"
  (^com.amazonaws.services.gamelift.model.DescribeInstancesResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeInstancesRequest request]
    (-> this (.describeInstances request))))

(defn describe-ec-2-instance-limits
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest`

  returns: Result of the DescribeEC2InstanceLimits operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest request]
    (-> this (.describeEC2InstanceLimits request))))

(defn list-builds
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ListBuildsRequest`

  returns: Result of the ListBuilds operation returned by the service. - `com.amazonaws.services.gamelift.model.ListBuildsResult`"
  (^com.amazonaws.services.gamelift.model.ListBuildsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.ListBuildsRequest request]
    (-> this (.listBuilds request))))

(defn start-matchmaking
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StartMatchmakingRequest`

  returns: Result of the StartMatchmaking operation returned by the service. - `com.amazonaws.services.gamelift.model.StartMatchmakingResult`"
  (^com.amazonaws.services.gamelift.model.StartMatchmakingResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StartMatchmakingRequest request]
    (-> this (.startMatchmaking request))))

(defn create-player-session
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest`

  returns: Result of the CreatePlayerSession operation returned by the service. - `com.amazonaws.services.gamelift.model.CreatePlayerSessionResult`"
  (^com.amazonaws.services.gamelift.model.CreatePlayerSessionResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest request]
    (-> this (.createPlayerSession request))))

(defn resolve-alias
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ResolveAliasRequest`

  returns: Result of the ResolveAlias operation returned by the service. - `com.amazonaws.services.gamelift.model.ResolveAliasResult`"
  (^com.amazonaws.services.gamelift.model.ResolveAliasResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.ResolveAliasRequest request]
    (-> this (.resolveAlias request))))

(defn list-fleets
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.gamelift.model.ListFleetsResult`"
  (^com.amazonaws.services.gamelift.model.ListFleetsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.ListFleetsRequest request]
    (-> this (.listFleets request))))

(defn stop-fleet-actions
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.StopFleetActionsRequest`

  returns: Result of the StopFleetActions operation returned by the service. - `com.amazonaws.services.gamelift.model.StopFleetActionsResult`"
  (^com.amazonaws.services.gamelift.model.StopFleetActionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.StopFleetActionsRequest request]
    (-> this (.stopFleetActions request))))

(defn delete-vpc-peering-connection
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest`

  returns: Result of the DeleteVpcPeeringConnection operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult`"
  (^com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest request]
    (-> this (.deleteVpcPeeringConnection request))))

(defn describe-fleet-events
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest`

  returns: Result of the DescribeFleetEvents operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeFleetEventsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeFleetEventsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest request]
    (-> this (.describeFleetEvents request))))

(defn create-player-sessions
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest`

  returns: Result of the CreatePlayerSessions operation returned by the service. - `com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult`"
  (^com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest request]
    (-> this (.createPlayerSessions request))))

(defn delete-script
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.DeleteScriptRequest`

  returns: Result of the DeleteScript operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteScriptResult`"
  (^com.amazonaws.services.gamelift.model.DeleteScriptResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteScriptRequest request]
    (-> this (.deleteScript request))))

(defn list-aliases
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.gamelift.model.ListAliasesResult`"
  (^com.amazonaws.services.gamelift.model.ListAliasesResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.ListAliasesRequest request]
    (-> this (.listAliases request))))

(defn create-game-session-queue
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest`

  returns: Result of the CreateGameSessionQueue operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult`"
  (^com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest request]
    (-> this (.createGameSessionQueue request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonGameLift

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonGameLift this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-script
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.DescribeScriptRequest`

  returns: Result of the DescribeScript operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeScriptResult`"
  (^com.amazonaws.services.gamelift.model.DescribeScriptResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeScriptRequest request]
    (-> this (.describeScript request))))

(defn describe-fleet-port-settings
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest`

  returns: Result of the DescribeFleetPortSettings operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult`"
  (^com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest request]
    (-> this (.describeFleetPortSettings request))))

(defn delete-matchmaking-configuration
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest`

  returns: Result of the DeleteMatchmakingConfiguration operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult`"
  (^com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest request]
    (-> this (.deleteMatchmakingConfiguration request))))

(defn describe-player-sessions
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest`

  returns: Result of the DescribePlayerSessions operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult`"
  (^com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest request]
    (-> this (.describePlayerSessions request))))

(defn describe-game-session-placement
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest`

  returns: Result of the DescribeGameSessionPlacement operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult`"
  (^com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest request]
    (-> this (.describeGameSessionPlacement request))))

(defn update-matchmaking-configuration
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest`

  returns: Result of the UpdateMatchmakingConfiguration operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult`"
  (^com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest request]
    (-> this (.updateMatchmakingConfiguration request))))

(defn describe-build
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeBuildRequest`

  returns: Result of the DescribeBuild operation returned by the service. - `com.amazonaws.services.gamelift.model.DescribeBuildResult`"
  (^com.amazonaws.services.gamelift.model.DescribeBuildResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DescribeBuildRequest request]
    (-> this (.describeBuild request))))

(defn update-script
  "Description copied from interface: AmazonGameLift

  request - `com.amazonaws.services.gamelift.model.UpdateScriptRequest`

  returns: Result of the UpdateScript operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateScriptResult`"
  (^com.amazonaws.services.gamelift.model.UpdateScriptResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateScriptRequest request]
    (-> this (.updateScript request))))

(defn delete-matchmaking-rule-set
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetRequest`

  returns: Result of the DeleteMatchmakingRuleSet operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetResult`"
  (^com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetRequest request]
    (-> this (.deleteMatchmakingRuleSet request))))

(defn delete-game-session-queue
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest`

  returns: Result of the DeleteGameSessionQueue operation returned by the service. - `com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult`"
  (^com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest request]
    (-> this (.deleteGameSessionQueue request))))

(defn create-matchmaking-rule-set
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest`

  returns: Result of the CreateMatchmakingRuleSet operation returned by the service. - `com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult`"
  (^com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest request]
    (-> this (.createMatchmakingRuleSet request))))

(defn put-scaling-policy
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.PutScalingPolicyRequest`

  returns: Result of the PutScalingPolicy operation returned by the service. - `com.amazonaws.services.gamelift.model.PutScalingPolicyResult`"
  (^com.amazonaws.services.gamelift.model.PutScalingPolicyResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicy request))))

(defn update-build
  "Description copied from interface: AmazonGameLift

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateBuildRequest`

  returns: Result of the UpdateBuild operation returned by the service. - `com.amazonaws.services.gamelift.model.UpdateBuildResult`"
  (^com.amazonaws.services.gamelift.model.UpdateBuildResult [^AbstractAmazonGameLift this ^com.amazonaws.services.gamelift.model.UpdateBuildRequest request]
    (-> this (.updateBuild request))))

