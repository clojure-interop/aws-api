(ns com.amazonaws.services.gamelift.AmazonGameLiftAsyncClient
  "Client for accessing Amazon GameLift asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon GameLift Service

  Amazon GameLift is a managed service for developers who need a scalable, dedicated server solution for their
  multiplayer games. Use Amazon GameLift for these tasks: (1) set up computing resources and deploy your game servers,
  (2) run game sessions and get players into games, (3) automatically scale your resources to meet player demand and
  manage costs, and (4) track in-depth metrics on game server performance and player usage.


  When setting up hosting resources, you can deploy your custom game server or use the Amazon GameLift Realtime
  Servers. Realtime Servers gives you the ability to quickly stand up lightweight, efficient game servers with the core
  Amazon GameLift infrastructure already built in.


  Get Amazon GameLift Tools and Resources


  This reference guide describes the low-level service API for Amazon GameLift and provides links to language-specific
  SDK reference topics. See also  Amazon GameLift Tools and
  Resources.


  API Summary


  The Amazon GameLift service API includes two key sets of actions:




  Manage game sessions and player access -- Integrate this functionality into game client services in order to create
  new game sessions, retrieve information on existing game sessions; reserve a player slot in a game session, request
  matchmaking, etc.




  Configure and manage game server resources -- Manage your Amazon GameLift hosting resources, including builds,
  scripts, fleets, queues, and aliases. Set up matchmakers, configure auto-scaling, retrieve game logs, and get hosting
  and game metrics.




    Task-based list of
  API actions"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.gamelift AmazonGameLiftAsyncClient]))

(defn ->amazon-game-lift-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonGameLiftAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonGameLiftAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonGameLiftAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonGameLiftAsyncClient aws-credentials executor-service))
  (^AmazonGameLiftAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonGameLiftAsyncClient client-configuration))
  (^AmazonGameLiftAsyncClient []
    (new AmazonGameLiftAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.gamelift.AmazonGameLiftAsyncClientBuilder`"
  (^com.amazonaws.services.gamelift.AmazonGameLiftAsyncClientBuilder []
    (AmazonGameLiftAsyncClient/asyncBuilder )))

(defn start-matchmaking-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StartMatchmakingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMatchmaking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StartMatchmakingResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartMatchmakingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMatchmakingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartMatchmakingRequest request]
    (-> this (.startMatchmakingAsync request))))

(defn describe-vpc-peering-connections-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcPeeringConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeVpcPeeringConnectionsRequest request]
    (-> this (.describeVpcPeeringConnectionsAsync request))))

(defn describe-scaling-policies-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeScalingPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeScalingPoliciesRequest request]
    (-> this (.describeScalingPoliciesAsync request))))

(defn list-aliases-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ListAliasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.ListAliasesResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListAliasesRequest request]
    (-> this (.listAliasesAsync request))))

(defn describe-player-sessions-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlayerSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribePlayerSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlayerSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribePlayerSessionsRequest request]
    (-> this (.describePlayerSessionsAsync request))))

(defn validate-matchmaking-rule-set-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateMatchmakingRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateMatchmakingRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ValidateMatchmakingRuleSetRequest request]
    (-> this (.validateMatchmakingRuleSetAsync request))))

(defn get-instance-access-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.GetInstanceAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.GetInstanceAccessResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.GetInstanceAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.GetInstanceAccessRequest request]
    (-> this (.getInstanceAccessAsync request))))

(defn delete-vpc-peering-authorization-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcPeeringAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcPeeringAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteVpcPeeringAuthorizationRequest request]
    (-> this (.deleteVpcPeeringAuthorizationAsync request))))

(defn describe-ec-2-instance-limits-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEC2InstanceLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEC2InstanceLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeEC2InstanceLimitsRequest request]
    (-> this (.describeEC2InstanceLimitsAsync request))))

(defn describe-fleet-attributes-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeFleetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetAttributesRequest request]
    (-> this (.describeFleetAttributesAsync request))))

(defn stop-matchmaking-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StopMatchmakingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopMatchmaking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StopMatchmakingResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StopMatchmakingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopMatchmakingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StopMatchmakingRequest request]
    (-> this (.stopMatchmakingAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonGameLiftAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-game-session-queue-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGameSessionQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteGameSessionQueueResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGameSessionQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteGameSessionQueueRequest request]
    (-> this (.deleteGameSessionQueueAsync request))))

(defn delete-scaling-policy-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteScalingPolicyRequest request]
    (-> this (.deleteScalingPolicyAsync request))))

(defn describe-instances-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeInstancesRequest request]
    (-> this (.describeInstancesAsync request))))

(defn create-alias-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateAliasRequest request]
    (-> this (.createAliasAsync request))))

(defn delete-matchmaking-rule-set-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMatchmakingRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMatchmakingRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteMatchmakingRuleSetRequest request]
    (-> this (.deleteMatchmakingRuleSetAsync request))))

(defn create-build-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateBuildRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateBuildResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateBuildRequest request]
    (-> this (.createBuildAsync request))))

(defn create-matchmaking-configuration-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMatchmakingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMatchmakingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateMatchmakingConfigurationRequest request]
    (-> this (.createMatchmakingConfigurationAsync request))))

(defn get-game-session-log-url-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGameSessionLogUrl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.GetGameSessionLogUrlResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGameSessionLogUrlAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.GetGameSessionLogUrlRequest request]
    (-> this (.getGameSessionLogUrlAsync request))))

(defn update-fleet-capacity-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleetCapacity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateFleetCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetCapacityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateFleetCapacityRequest request]
    (-> this (.updateFleetCapacityAsync request))))

(defn list-scripts-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.ListScriptsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListScripts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.ListScriptsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListScriptsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listScriptsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListScriptsRequest request]
    (-> this (.listScriptsAsync request))))

(defn resolve-alias-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ResolveAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.ResolveAliasResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ResolveAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ResolveAliasRequest request]
    (-> this (.resolveAliasAsync request))))

(defn describe-game-session-queues-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGameSessionQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGameSessionQueuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionQueuesRequest request]
    (-> this (.describeGameSessionQueuesAsync request))))

(defn start-game-session-placement-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartGameSessionPlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StartGameSessionPlacementResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startGameSessionPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartGameSessionPlacementRequest request]
    (-> this (.startGameSessionPlacementAsync request))))

(defn update-game-session-queue-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGameSessionQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateGameSessionQueueResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGameSessionQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateGameSessionQueueRequest request]
    (-> this (.updateGameSessionQueueAsync request))))

(defn describe-matchmaking-rule-sets-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMatchmakingRuleSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMatchmakingRuleSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingRuleSetsRequest request]
    (-> this (.describeMatchmakingRuleSetsAsync request))))

(defn describe-vpc-peering-authorizations-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcPeeringAuthorizations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcPeeringAuthorizationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeVpcPeeringAuthorizationsRequest request]
    (-> this (.describeVpcPeeringAuthorizationsAsync request))))

(defn request-upload-credentials-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestUploadCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.RequestUploadCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestUploadCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.RequestUploadCredentialsRequest request]
    (-> this (.requestUploadCredentialsAsync request))))

(defn describe-matchmaking-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMatchmaking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeMatchmakingResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMatchmakingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingRequest request]
    (-> this (.describeMatchmakingAsync request))))

(defn update-game-session-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateGameSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGameSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateGameSessionResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateGameSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGameSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateGameSessionRequest request]
    (-> this (.updateGameSessionAsync request))))

(defn delete-matchmaking-configuration-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMatchmakingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMatchmakingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteMatchmakingConfigurationRequest request]
    (-> this (.deleteMatchmakingConfigurationAsync request))))

(defn update-matchmaking-configuration-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMatchmakingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMatchmakingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateMatchmakingConfigurationRequest request]
    (-> this (.updateMatchmakingConfigurationAsync request))))

(defn search-game-sessions-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.SearchGameSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchGameSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.SearchGameSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.SearchGameSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchGameSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.SearchGameSessionsRequest request]
    (-> this (.searchGameSessionsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonGameLiftAsyncClient this]
    (-> this (.shutdown))))

(defn describe-matchmaking-configurations-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMatchmakingConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMatchmakingConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeMatchmakingConfigurationsRequest request]
    (-> this (.describeMatchmakingConfigurationsAsync request))))

(defn create-player-session-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlayerSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreatePlayerSessionResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlayerSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreatePlayerSessionRequest request]
    (-> this (.createPlayerSessionAsync request))))

(defn update-fleet-attributes-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleetAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateFleetAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateFleetAttributesRequest request]
    (-> this (.updateFleetAttributesAsync request))))

(defn create-fleet-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateFleetRequest request]
    (-> this (.createFleetAsync request))))

(defn create-vpc-peering-authorization-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcPeeringAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcPeeringAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateVpcPeeringAuthorizationRequest request]
    (-> this (.createVpcPeeringAuthorizationAsync request))))

(defn describe-game-sessions-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGameSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeGameSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGameSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionsRequest request]
    (-> this (.describeGameSessionsAsync request))))

(defn describe-fleet-port-settings-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetPortSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetPortSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetPortSettingsRequest request]
    (-> this (.describeFleetPortSettingsAsync request))))

(defn accept-match-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.AcceptMatchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptMatch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.AcceptMatchResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.AcceptMatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptMatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.AcceptMatchRequest request]
    (-> this (.acceptMatchAsync request))))

(defn stop-game-session-placement-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopGameSessionPlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StopGameSessionPlacementResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopGameSessionPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StopGameSessionPlacementRequest request]
    (-> this (.stopGameSessionPlacementAsync request))))

(defn delete-alias-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteAliasResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteAliasRequest request]
    (-> this (.deleteAliasAsync request))))

(defn describe-fleet-events-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeFleetEventsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetEventsRequest request]
    (-> this (.describeFleetEventsAsync request))))

(defn start-match-backfill-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.StartMatchBackfillRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMatchBackfill operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StartMatchBackfillResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartMatchBackfillRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMatchBackfillAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartMatchBackfillRequest request]
    (-> this (.startMatchBackfillAsync request))))

(defn describe-runtime-configuration-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRuntimeConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRuntimeConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeRuntimeConfigurationRequest request]
    (-> this (.describeRuntimeConfigurationAsync request))))

(defn delete-fleet-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteFleetRequest request]
    (-> this (.deleteFleetAsync request))))

(defn create-game-session-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateGameSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGameSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateGameSessionResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateGameSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGameSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateGameSessionRequest request]
    (-> this (.createGameSessionAsync request))))

(defn create-game-session-queue-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGameSessionQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateGameSessionQueueResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGameSessionQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateGameSessionQueueRequest request]
    (-> this (.createGameSessionQueueAsync request))))

(defn describe-script-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.DescribeScriptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScript operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeScriptResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeScriptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScriptAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeScriptRequest request]
    (-> this (.describeScriptAsync request))))

(defn describe-alias-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeAliasResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeAliasRequest request]
    (-> this (.describeAliasAsync request))))

(defn describe-game-session-placement-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGameSessionPlacement operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGameSessionPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionPlacementRequest request]
    (-> this (.describeGameSessionPlacementAsync request))))

(defn list-fleets-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ListFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.ListFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListFleetsRequest request]
    (-> this (.listFleetsAsync request))))

(defn list-builds-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.ListBuildsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.ListBuildsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.ListBuildsRequest request]
    (-> this (.listBuildsAsync request))))

(defn stop-fleet-actions-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.StopFleetActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopFleetActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StopFleetActionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StopFleetActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopFleetActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StopFleetActionsRequest request]
    (-> this (.stopFleetActionsAsync request))))

(defn start-fleet-actions-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.StartFleetActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFleetActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.StartFleetActionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartFleetActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFleetActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.StartFleetActionsRequest request]
    (-> this (.startFleetActionsAsync request))))

(defn put-scaling-policy-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.PutScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.PutScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.PutScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicyAsync request))))

(defn create-matchmaking-rule-set-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMatchmakingRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMatchmakingRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateMatchmakingRuleSetRequest request]
    (-> this (.createMatchmakingRuleSetAsync request))))

(defn delete-script-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.DeleteScriptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScript operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteScriptResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteScriptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScriptAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteScriptRequest request]
    (-> this (.deleteScriptAsync request))))

(defn describe-build-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeBuildRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeBuildResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeBuildRequest request]
    (-> this (.describeBuildAsync request))))

(defn update-alias-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateAliasResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateAliasRequest request]
    (-> this (.updateAliasAsync request))))

(defn update-build-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateBuildRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateBuildResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateBuildRequest request]
    (-> this (.updateBuildAsync request))))

(defn update-script-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.UpdateScriptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScript operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateScriptResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateScriptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScriptAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateScriptRequest request]
    (-> this (.updateScriptAsync request))))

(defn delete-vpc-peering-connection-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcPeeringConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteVpcPeeringConnectionRequest request]
    (-> this (.deleteVpcPeeringConnectionAsync request))))

(defn describe-game-session-details-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGameSessionDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGameSessionDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeGameSessionDetailsRequest request]
    (-> this (.describeGameSessionDetailsAsync request))))

(defn describe-fleet-capacity-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetCapacity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeFleetCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetCapacityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetCapacityRequest request]
    (-> this (.describeFleetCapacityAsync request))))

(defn describe-fleet-utilization-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetUtilization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DescribeFleetUtilizationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetUtilizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DescribeFleetUtilizationRequest request]
    (-> this (.describeFleetUtilizationAsync request))))

(defn update-fleet-port-settings-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleetPortSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetPortSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateFleetPortSettingsRequest request]
    (-> this (.updateFleetPortSettingsAsync request))))

(defn create-player-sessions-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlayerSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreatePlayerSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlayerSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreatePlayerSessionsRequest request]
    (-> this (.createPlayerSessionsAsync request))))

(defn create-script-async
  "Description copied from interface: AmazonGameLiftAsync

  request - `com.amazonaws.services.gamelift.model.CreateScriptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScript operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateScriptResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateScriptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScriptAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateScriptRequest request]
    (-> this (.createScriptAsync request))))

(defn create-vpc-peering-connection-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcPeeringConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.CreateVpcPeeringConnectionRequest request]
    (-> this (.createVpcPeeringConnectionAsync request))))

(defn update-runtime-configuration-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRuntimeConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRuntimeConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.UpdateRuntimeConfigurationRequest request]
    (-> this (.updateRuntimeConfigurationAsync request))))

(defn delete-build-async
  "Description copied from interface: AmazonGameLiftAsync

  request - Represents the input for a request action. - `com.amazonaws.services.gamelift.model.DeleteBuildRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.gamelift.model.DeleteBuildResult>`"
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGameLiftAsyncClient this ^com.amazonaws.services.gamelift.model.DeleteBuildRequest request]
    (-> this (.deleteBuildAsync request))))

