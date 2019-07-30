(ns com.amazonaws.services.robomaker.AWSRoboMakerAsyncClient
  "Client for accessing RoboMaker asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.


  This section provides documentation for the AWS RoboMaker API operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.robomaker AWSRoboMakerAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.robomaker.AWSRoboMakerAsyncClientBuilder`"
  (^com.amazonaws.services.robomaker.AWSRoboMakerAsyncClientBuilder []
    (AWSRoboMakerAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn register-robot-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.RegisterRobotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.RegisterRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerRobotAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest request]
    (-> this (.registerRobotAsync request))))

(defn describe-simulation-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSimulationApplication operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSimulationApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest request]
    (-> this (.describeSimulationApplicationAsync request))))

(defn describe-robot-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRobotApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest request]
    (-> this (.describeRobotApplicationAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSRoboMakerAsyncClient this]
    (-> this (.getExecutorService))))

(defn cancel-deployment-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CancelDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelDeploymentJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest request]
    (-> this (.cancelDeploymentJobAsync request))))

(defn update-robot-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRobotApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest request]
    (-> this (.updateRobotApplicationAsync request))))

(defn list-simulation-jobs-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListSimulationJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSimulationJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListSimulationJobsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSimulationJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest request]
    (-> this (.listSimulationJobsAsync request))))

(defn update-simulation-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSimulationApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSimulationApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest request]
    (-> this (.updateSimulationApplicationAsync request))))

(defn sync-deployment-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SyncDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.SyncDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.syncDeploymentJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest request]
    (-> this (.syncDeploymentJobAsync request))))

(defn create-simulation-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSimulationApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSimulationApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest request]
    (-> this (.createSimulationApplicationAsync request))))

(defn create-robot-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateRobotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateRobotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRobotAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateRobotRequest request]
    (-> this (.createRobotAsync request))))

(defn create-robot-application-version-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRobotApplicationVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRobotApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest request]
    (-> this (.createRobotApplicationVersionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSRoboMakerAsyncClient this]
    (-> this (.shutdown))))

(defn delete-robot-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DeleteRobotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRobotAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest request]
    (-> this (.deleteRobotAsync request))))

(defn create-fleet-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateFleetRequest request]
    (-> this (.createFleetAsync request))))

(defn describe-robot-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DescribeRobotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRobotAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest request]
    (-> this (.describeRobotAsync request))))

(defn list-robot-applications-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRobotApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListRobotApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRobotApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest request]
    (-> this (.listRobotApplicationsAsync request))))

(defn list-deployment-jobs-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListDeploymentJobsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest request]
    (-> this (.listDeploymentJobsAsync request))))

(defn delete-robot-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRobotApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest request]
    (-> this (.deleteRobotApplicationAsync request))))

(defn list-simulation-applications-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSimulationApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSimulationApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest request]
    (-> this (.listSimulationApplicationsAsync request))))

(defn create-robot-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRobotApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest request]
    (-> this (.createRobotApplicationAsync request))))

(defn delete-fleet-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DeleteFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest request]
    (-> this (.deleteFleetAsync request))))

(defn create-simulation-application-version-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSimulationApplicationVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSimulationApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest request]
    (-> this (.createSimulationApplicationVersionAsync request))))

(defn restart-simulation-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.RestartSimulationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestartSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.RestartSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restartSimulationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest request]
    (-> this (.restartSimulationJobAsync request))))

(defn describe-simulation-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSimulationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest request]
    (-> this (.describeSimulationJobAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-fleets-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListFleetsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListFleetsRequest request]
    (-> this (.listFleetsAsync request))))

(defn create-deployment-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest request]
    (-> this (.createDeploymentJobAsync request))))

(defn describe-fleet-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DescribeFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeFleetResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest request]
    (-> this (.describeFleetAsync request))))

(defn create-simulation-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CreateSimulationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSimulationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest request]
    (-> this (.createSimulationJobAsync request))))

(defn cancel-simulation-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.CancelSimulationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CancelSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSimulationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest request]
    (-> this (.cancelSimulationJobAsync request))))

(defn deregister-robot-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DeregisterRobotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeregisterRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterRobotAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest request]
    (-> this (.deregisterRobotAsync request))))

(defn list-robots-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.ListRobotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRobots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListRobotsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListRobotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRobotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.ListRobotsRequest request]
    (-> this (.listRobotsAsync request))))

(defn batch-describe-simulation-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDescribeSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDescribeSimulationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest request]
    (-> this (.batchDescribeSimulationJobAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-deployment-job-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeploymentJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest request]
    (-> this (.describeDeploymentJobAsync request))))

(defn delete-simulation-application-async
  "Description copied from interface: AWSRoboMakerAsync

  request - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSimulationApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSimulationApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsyncClient this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest request]
    (-> this (.deleteSimulationApplicationAsync request))))

