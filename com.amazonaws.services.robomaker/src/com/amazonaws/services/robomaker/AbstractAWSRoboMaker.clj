(ns com.amazonaws.services.robomaker.AbstractAWSRoboMaker
  "Abstract implementation of AWSRoboMaker. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.robomaker AbstractAWSRoboMaker]))

(defn describe-robot-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest`

  returns: Result of the DescribeRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult`"
  (^com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest request]
    (-> this (.describeRobotApplication request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.robomaker.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.robomaker.model.ListTagsForResourceResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-fleet
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteFleetResult`"
  (^com.amazonaws.services.robomaker.model.DeleteFleetResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn delete-robot-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest`

  returns: Result of the DeleteRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult`"
  (^com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest request]
    (-> this (.deleteRobotApplication request))))

(defn deregister-robot
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DeregisterRobotRequest`

  returns: Result of the DeregisterRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DeregisterRobotResult`"
  (^com.amazonaws.services.robomaker.model.DeregisterRobotResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest request]
    (-> this (.deregisterRobot request))))

(defn create-simulation-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateSimulationJobRequest`

  returns: Result of the CreateSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationJobResult`"
  (^com.amazonaws.services.robomaker.model.CreateSimulationJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest request]
    (-> this (.createSimulationJob request))))

(defn create-simulation-application-version
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest`

  returns: Result of the CreateSimulationApplicationVersion operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult`"
  (^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest request]
    (-> this (.createSimulationApplicationVersion request))))

(defn delete-robot
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DeleteRobotRequest`

  returns: Result of the DeleteRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteRobotResult`"
  (^com.amazonaws.services.robomaker.model.DeleteRobotResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest request]
    (-> this (.deleteRobot request))))

(defn register-robot
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.RegisterRobotRequest`

  returns: Result of the RegisterRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.RegisterRobotResult`"
  (^com.amazonaws.services.robomaker.model.RegisterRobotResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest request]
    (-> this (.registerRobot request))))

(defn describe-deployment-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest`

  returns: Result of the DescribeDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult`"
  (^com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest request]
    (-> this (.describeDeploymentJob request))))

(defn untag-resource
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.robomaker.model.UntagResourceResult`"
  (^com.amazonaws.services.robomaker.model.UntagResourceResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-simulation-jobs
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListSimulationJobsRequest`

  returns: Result of the ListSimulationJobs operation returned by the service. - `com.amazonaws.services.robomaker.model.ListSimulationJobsResult`"
  (^com.amazonaws.services.robomaker.model.ListSimulationJobsResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest request]
    (-> this (.listSimulationJobs request))))

(defn create-fleet
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateFleetResult`"
  (^com.amazonaws.services.robomaker.model.CreateFleetResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn create-deployment-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest`

  returns: Result of the CreateDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateDeploymentJobResult`"
  (^com.amazonaws.services.robomaker.model.CreateDeploymentJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest request]
    (-> this (.createDeploymentJob request))))

(defn cancel-deployment-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest`

  returns: Result of the CancelDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CancelDeploymentJobResult`"
  (^com.amazonaws.services.robomaker.model.CancelDeploymentJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest request]
    (-> this (.cancelDeploymentJob request))))

(defn create-simulation-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest`

  returns: Result of the CreateSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult`"
  (^com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest request]
    (-> this (.createSimulationApplication request))))

(defn update-robot-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest`

  returns: Result of the UpdateRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult`"
  (^com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest request]
    (-> this (.updateRobotApplication request))))

(defn shutdown
  "Description copied from interface: AWSRoboMaker"
  ([^AbstractAWSRoboMaker this]
    (-> this (.shutdown))))

(defn restart-simulation-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.RestartSimulationJobRequest`

  returns: Result of the RestartSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.RestartSimulationJobResult`"
  (^com.amazonaws.services.robomaker.model.RestartSimulationJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest request]
    (-> this (.restartSimulationJob request))))

(defn list-deployment-jobs
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest`

  returns: Result of the ListDeploymentJobs operation returned by the service. - `com.amazonaws.services.robomaker.model.ListDeploymentJobsResult`"
  (^com.amazonaws.services.robomaker.model.ListDeploymentJobsResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest request]
    (-> this (.listDeploymentJobs request))))

(defn cancel-simulation-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CancelSimulationJobRequest`

  returns: Result of the CancelSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CancelSimulationJobResult`"
  (^com.amazonaws.services.robomaker.model.CancelSimulationJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest request]
    (-> this (.cancelSimulationJob request))))

(defn describe-robot
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DescribeRobotRequest`

  returns: Result of the DescribeRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeRobotResult`"
  (^com.amazonaws.services.robomaker.model.DescribeRobotResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest request]
    (-> this (.describeRobot request))))

(defn describe-simulation-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest`

  returns: Result of the DescribeSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeSimulationJobResult`"
  (^com.amazonaws.services.robomaker.model.DescribeSimulationJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest request]
    (-> this (.describeSimulationJob request))))

(defn describe-fleet
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DescribeFleetRequest`

  returns: Result of the DescribeFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeFleetResult`"
  (^com.amazonaws.services.robomaker.model.DescribeFleetResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest request]
    (-> this (.describeFleet request))))

(defn create-robot-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest`

  returns: Result of the CreateRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotApplicationResult`"
  (^com.amazonaws.services.robomaker.model.CreateRobotApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest request]
    (-> this (.createRobotApplication request))))

(defn list-simulation-applications
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest`

  returns: Result of the ListSimulationApplications operation returned by the service. - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult`"
  (^com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest request]
    (-> this (.listSimulationApplications request))))

(defn batch-describe-simulation-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest`

  returns: Result of the BatchDescribeSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult`"
  (^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest request]
    (-> this (.batchDescribeSimulationJob request))))

(defn describe-simulation-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest`

  returns: Result of the DescribeSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult`"
  (^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest request]
    (-> this (.describeSimulationApplication request))))

(defn list-fleets
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.robomaker.model.ListFleetsResult`"
  (^com.amazonaws.services.robomaker.model.ListFleetsResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListFleetsRequest request]
    (-> this (.listFleets request))))

(defn list-robot-applications
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest`

  returns: Result of the ListRobotApplications operation returned by the service. - `com.amazonaws.services.robomaker.model.ListRobotApplicationsResult`"
  (^com.amazonaws.services.robomaker.model.ListRobotApplicationsResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest request]
    (-> this (.listRobotApplications request))))

(defn create-robot-application-version
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest`

  returns: Result of the CreateRobotApplicationVersion operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult`"
  (^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest request]
    (-> this (.createRobotApplicationVersion request))))

(defn update-simulation-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest`

  returns: Result of the UpdateSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult`"
  (^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest request]
    (-> this (.updateSimulationApplication request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSRoboMaker

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSRoboMaker this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-robot
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.CreateRobotRequest`

  returns: Result of the CreateRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotResult`"
  (^com.amazonaws.services.robomaker.model.CreateRobotResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateRobotRequest request]
    (-> this (.createRobot request))))

(defn sync-deployment-job
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest`

  returns: Result of the SyncDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.SyncDeploymentJobResult`"
  (^com.amazonaws.services.robomaker.model.SyncDeploymentJobResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest request]
    (-> this (.syncDeploymentJob request))))

(defn tag-resource
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.robomaker.model.TagResourceResult`"
  (^com.amazonaws.services.robomaker.model.TagResourceResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-robots
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.ListRobotsRequest`

  returns: Result of the ListRobots operation returned by the service. - `com.amazonaws.services.robomaker.model.ListRobotsResult`"
  (^com.amazonaws.services.robomaker.model.ListRobotsResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListRobotsRequest request]
    (-> this (.listRobots request))))

(defn delete-simulation-application
  "Description copied from interface: AWSRoboMaker

  request - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest`

  returns: Result of the DeleteSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult`"
  (^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult [^AbstractAWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest request]
    (-> this (.deleteSimulationApplication request))))

