(ns com.amazonaws.services.robomaker.AWSRoboMakerAsync
  "Interface for accessing RoboMaker asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSRoboMakerAsync instead.



  This section provides documentation for the AWS RoboMaker API operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.robomaker AWSRoboMakerAsync]))

(defn untag-resource-async
  "Removes the specified tags from the specified AWS RoboMaker resource.


   To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource .

  untag-resource-request - `com.amazonaws.services.robomaker.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn register-robot-async
  "Registers a robot with a fleet.

  register-robot-request - `com.amazonaws.services.robomaker.model.RegisterRobotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.RegisterRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest register-robot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerRobotAsync register-robot-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest register-robot-request]
    (-> this (.registerRobotAsync register-robot-request))))

(defn describe-simulation-application-async
  "Describes a simulation application.

  describe-simulation-application-request - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSimulationApplication operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest describe-simulation-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSimulationApplicationAsync describe-simulation-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest describe-simulation-application-request]
    (-> this (.describeSimulationApplicationAsync describe-simulation-application-request))))

(defn describe-robot-application-async
  "Describes a robot application.

  describe-robot-application-request - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest describe-robot-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRobotApplicationAsync describe-robot-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest describe-robot-application-request]
    (-> this (.describeRobotApplicationAsync describe-robot-application-request))))

(defn cancel-deployment-job-async
  "Cancels the specified deployment job.

  cancel-deployment-job-request - `com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CancelDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest cancel-deployment-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelDeploymentJobAsync cancel-deployment-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest cancel-deployment-job-request]
    (-> this (.cancelDeploymentJobAsync cancel-deployment-job-request))))

(defn update-robot-application-async
  "Updates a robot application.

  update-robot-application-request - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest update-robot-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRobotApplicationAsync update-robot-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest update-robot-application-request]
    (-> this (.updateRobotApplicationAsync update-robot-application-request))))

(defn list-simulation-jobs-async
  "Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.

  list-simulation-jobs-request - `com.amazonaws.services.robomaker.model.ListSimulationJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSimulationJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListSimulationJobsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest list-simulation-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSimulationJobsAsync list-simulation-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest list-simulation-jobs-request]
    (-> this (.listSimulationJobsAsync list-simulation-jobs-request))))

(defn update-simulation-application-async
  "Updates a simulation application.

  update-simulation-application-request - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSimulationApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest update-simulation-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSimulationApplicationAsync update-simulation-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest update-simulation-application-request]
    (-> this (.updateSimulationApplicationAsync update-simulation-application-request))))

(defn sync-deployment-job-async
  "Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.

  sync-deployment-job-request - `com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SyncDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.SyncDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest sync-deployment-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.syncDeploymentJobAsync sync-deployment-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest sync-deployment-job-request]
    (-> this (.syncDeploymentJobAsync sync-deployment-job-request))))

(defn create-simulation-application-async
  "Creates a simulation application.

  create-simulation-application-request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSimulationApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest create-simulation-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSimulationApplicationAsync create-simulation-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest create-simulation-application-request]
    (-> this (.createSimulationApplicationAsync create-simulation-application-request))))

(defn create-robot-async
  "Creates a robot.

  create-robot-request - `com.amazonaws.services.robomaker.model.CreateRobotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateRobotRequest create-robot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRobotAsync create-robot-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateRobotRequest create-robot-request]
    (-> this (.createRobotAsync create-robot-request))))

(defn create-robot-application-version-async
  "Creates a version of a robot application.

  create-robot-application-version-request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRobotApplicationVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest create-robot-application-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRobotApplicationVersionAsync create-robot-application-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest create-robot-application-version-request]
    (-> this (.createRobotApplicationVersionAsync create-robot-application-version-request))))

(defn delete-robot-async
  "Deletes a robot.

  delete-robot-request - `com.amazonaws.services.robomaker.model.DeleteRobotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest delete-robot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRobotAsync delete-robot-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest delete-robot-request]
    (-> this (.deleteRobotAsync delete-robot-request))))

(defn create-fleet-async
  "Creates a fleet, a logical group of robots running the same robot application.

  create-fleet-request - `com.amazonaws.services.robomaker.model.CreateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateFleetRequest create-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync create-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleetAsync create-fleet-request))))

(defn describe-robot-async
  "Describes a robot.

  describe-robot-request - `com.amazonaws.services.robomaker.model.DescribeRobotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest describe-robot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRobotAsync describe-robot-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest describe-robot-request]
    (-> this (.describeRobotAsync describe-robot-request))))

(defn list-robot-applications-async
  "Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.

  list-robot-applications-request - `com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRobotApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListRobotApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest list-robot-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRobotApplicationsAsync list-robot-applications-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest list-robot-applications-request]
    (-> this (.listRobotApplicationsAsync list-robot-applications-request))))

(defn list-deployment-jobs-async
  "Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
   jobs.

  list-deployment-jobs-request - `com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListDeploymentJobsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest list-deployment-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentJobsAsync list-deployment-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest list-deployment-jobs-request]
    (-> this (.listDeploymentJobsAsync list-deployment-jobs-request))))

(defn delete-robot-application-async
  "Deletes a robot application.

  delete-robot-application-request - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest delete-robot-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRobotApplicationAsync delete-robot-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest delete-robot-application-request]
    (-> this (.deleteRobotApplicationAsync delete-robot-application-request))))

(defn list-simulation-applications-async
  "Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
   applications.

  list-simulation-applications-request - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSimulationApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest list-simulation-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSimulationApplicationsAsync list-simulation-applications-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest list-simulation-applications-request]
    (-> this (.listSimulationApplicationsAsync list-simulation-applications-request))))

(defn create-robot-application-async
  "Creates a robot application.

  create-robot-application-request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRobotApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateRobotApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest create-robot-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRobotApplicationAsync create-robot-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest create-robot-application-request]
    (-> this (.createRobotApplicationAsync create-robot-application-request))))

(defn delete-fleet-async
  "Deletes a fleet.

  delete-fleet-request - `com.amazonaws.services.robomaker.model.DeleteFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest delete-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync delete-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest delete-fleet-request]
    (-> this (.deleteFleetAsync delete-fleet-request))))

(defn create-simulation-application-version-async
  "Creates a simulation application with a specific revision id.

  create-simulation-application-version-request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSimulationApplicationVersion operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest create-simulation-application-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSimulationApplicationVersionAsync create-simulation-application-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest create-simulation-application-version-request]
    (-> this (.createSimulationApplicationVersionAsync create-simulation-application-version-request))))

(defn restart-simulation-job-async
  "Restarts a running simulation job.

  restart-simulation-job-request - `com.amazonaws.services.robomaker.model.RestartSimulationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestartSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.RestartSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest restart-simulation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restartSimulationJobAsync restart-simulation-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest restart-simulation-job-request]
    (-> this (.restartSimulationJobAsync restart-simulation-job-request))))

(defn describe-simulation-job-async
  "Describes a simulation job.

  describe-simulation-job-request - `com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest describe-simulation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSimulationJobAsync describe-simulation-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest describe-simulation-job-request]
    (-> this (.describeSimulationJobAsync describe-simulation-job-request))))

(defn list-tags-for-resource-async
  "Lists all tags on a AWS RoboMaker resource.

  list-tags-for-resource-request - `com.amazonaws.services.robomaker.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn list-fleets-async
  "Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.

  list-fleets-request - `com.amazonaws.services.robomaker.model.ListFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListFleetsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListFleetsRequest list-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFleetsAsync list-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListFleetsRequest list-fleets-request]
    (-> this (.listFleetsAsync list-fleets-request))))

(defn create-deployment-job-async
  "Deploys a specific version of a robot application to robots in a fleet.


   The robot application must have a numbered applicationVersion for consistency reasons. To create a
   new version, use CreateRobotApplicationVersion or see Creating a Robot
   Application Version.



   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.

  create-deployment-job-request - `com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest create-deployment-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentJobAsync create-deployment-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest create-deployment-job-request]
    (-> this (.createDeploymentJobAsync create-deployment-job-request))))

(defn describe-fleet-async
  "Describes a fleet.

  describe-fleet-request - `com.amazonaws.services.robomaker.model.DescribeFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeFleetResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest describe-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetAsync describe-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest describe-fleet-request]
    (-> this (.describeFleetAsync describe-fleet-request))))

(defn create-simulation-job-async
  "Creates a simulation job.



   After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.

  create-simulation-job-request - `com.amazonaws.services.robomaker.model.CreateSimulationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CreateSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest create-simulation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSimulationJobAsync create-simulation-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest create-simulation-job-request]
    (-> this (.createSimulationJobAsync create-simulation-job-request))))

(defn cancel-simulation-job-async
  "Cancels the specified simulation job.

  cancel-simulation-job-request - `com.amazonaws.services.robomaker.model.CancelSimulationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.CancelSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest cancel-simulation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSimulationJobAsync cancel-simulation-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest cancel-simulation-job-request]
    (-> this (.cancelSimulationJobAsync cancel-simulation-job-request))))

(defn deregister-robot-async
  "Deregisters a robot.

  deregister-robot-request - `com.amazonaws.services.robomaker.model.DeregisterRobotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterRobot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeregisterRobotResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest deregister-robot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterRobotAsync deregister-robot-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest deregister-robot-request]
    (-> this (.deregisterRobotAsync deregister-robot-request))))

(defn list-robots-async
  "Returns a list of robots. You can optionally provide filters to retrieve specific robots.

  list-robots-request - `com.amazonaws.services.robomaker.model.ListRobotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRobots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.ListRobotsResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListRobotsRequest list-robots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRobotsAsync list-robots-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.ListRobotsRequest list-robots-request]
    (-> this (.listRobotsAsync list-robots-request))))

(defn batch-describe-simulation-job-async
  "Describes one or more simulation jobs.

  batch-describe-simulation-job-request - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDescribeSimulationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest batch-describe-simulation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDescribeSimulationJobAsync batch-describe-simulation-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest batch-describe-simulation-job-request]
    (-> this (.batchDescribeSimulationJobAsync batch-describe-simulation-job-request))))

(defn tag-resource-async
  "Adds or edits tags for a AWS RoboMaker resource.


   Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
   empty strings.


   For information about the rules that apply to tag keys and tag values, see User-Defined
   Tag Restrictions in the AWS Billing and Cost Management User Guide.

  tag-resource-request - `com.amazonaws.services.robomaker.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-deployment-job-async
  "Describes a deployment job.

  describe-deployment-job-request - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeploymentJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest describe-deployment-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeploymentJobAsync describe-deployment-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest describe-deployment-job-request]
    (-> this (.describeDeploymentJobAsync describe-deployment-job-request))))

(defn delete-simulation-application-async
  "Deletes a simulation application.

  delete-simulation-application-request - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSimulationApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult>`"
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest delete-simulation-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSimulationApplicationAsync delete-simulation-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSRoboMakerAsync this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest delete-simulation-application-request]
    (-> this (.deleteSimulationApplicationAsync delete-simulation-application-request))))

