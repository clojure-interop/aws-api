(ns com.amazonaws.services.robomaker.AWSRoboMakerClient
  "Client for accessing RoboMaker. All service calls made using this client are blocking, and will not return until the
  service call completes.


  This section provides documentation for the AWS RoboMaker API operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.robomaker AWSRoboMakerClient]))

(defn *builder
  "returns: `com.amazonaws.services.robomaker.AWSRoboMakerClientBuilder`"
  (^com.amazonaws.services.robomaker.AWSRoboMakerClientBuilder []
    (AWSRoboMakerClient/builder )))

(defn describe-robot-application
  "Describes a robot application.

  request - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest`

  returns: Result of the DescribeRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest request]
    (-> this (.describeRobotApplication request))))

(defn list-tags-for-resource
  "Lists all tags on a AWS RoboMaker resource.

  request - `com.amazonaws.services.robomaker.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.robomaker.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.robomaker.model.InternalServerException - AWS RoboMaker experienced a service issue. Try your call again."
  (^com.amazonaws.services.robomaker.model.ListTagsForResourceResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-fleet
  "Deletes a fleet.

  request - `com.amazonaws.services.robomaker.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteFleetResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteFleetResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn delete-robot-application
  "Deletes a robot application.

  request - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest`

  returns: Result of the DeleteRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest request]
    (-> this (.deleteRobotApplication request))))

(defn deregister-robot
  "Deregisters a robot.

  request - `com.amazonaws.services.robomaker.model.DeregisterRobotRequest`

  returns: Result of the DeregisterRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DeregisterRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeregisterRobotResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest request]
    (-> this (.deregisterRobot request))))

(defn create-simulation-job
  "Creates a simulation job.



   After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.

  request - `com.amazonaws.services.robomaker.model.CreateSimulationJobRequest`

  returns: Result of the CreateSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CreateSimulationJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest request]
    (-> this (.createSimulationJob request))))

(defn create-simulation-application-version
  "Creates a simulation application with a specific revision id.

  request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest`

  returns: Result of the CreateSimulationApplicationVersion operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest request]
    (-> this (.createSimulationApplicationVersion request))))

(defn delete-robot
  "Deletes a robot.

  request - `com.amazonaws.services.robomaker.model.DeleteRobotRequest`

  returns: Result of the DeleteRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteRobotResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest request]
    (-> this (.deleteRobot request))))

(defn register-robot
  "Registers a robot with a fleet.

  request - `com.amazonaws.services.robomaker.model.RegisterRobotRequest`

  returns: Result of the RegisterRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.RegisterRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.RegisterRobotResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest request]
    (-> this (.registerRobot request))))

(defn describe-deployment-job
  "Describes a deployment job.

  request - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest`

  returns: Result of the DescribeDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest request]
    (-> this (.describeDeploymentJob request))))

(defn untag-resource
  "Removes the specified tags from the specified AWS RoboMaker resource.


   To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource .

  request - `com.amazonaws.services.robomaker.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.robomaker.model.UntagResourceResult`

  throws: com.amazonaws.services.robomaker.model.InternalServerException - AWS RoboMaker experienced a service issue. Try your call again."
  (^com.amazonaws.services.robomaker.model.UntagResourceResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-simulation-jobs
  "Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.

  request - `com.amazonaws.services.robomaker.model.ListSimulationJobsRequest`

  returns: Result of the ListSimulationJobs operation returned by the service. - `com.amazonaws.services.robomaker.model.ListSimulationJobsResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.ListSimulationJobsResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest request]
    (-> this (.listSimulationJobs request))))

(defn create-fleet
  "Creates a fleet, a logical group of robots running the same robot application.

  request - `com.amazonaws.services.robomaker.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateFleetResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateFleetResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn create-deployment-job
  "Deploys a specific version of a robot application to robots in a fleet.


   The robot application must have a numbered applicationVersion for consistency reasons. To create a
   new version, use CreateRobotApplicationVersion or see Creating a Robot
   Application Version.



   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.

  request - `com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest`

  returns: Result of the CreateDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CreateDeploymentJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest request]
    (-> this (.createDeploymentJob request))))

(defn cancel-deployment-job
  "Cancels the specified deployment job.

  request - `com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest`

  returns: Result of the CancelDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CancelDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CancelDeploymentJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest request]
    (-> this (.cancelDeploymentJob request))))

(defn create-simulation-application
  "Creates a simulation application.

  request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest`

  returns: Result of the CreateSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest request]
    (-> this (.createSimulationApplication request))))

(defn update-robot-application
  "Updates a robot application.

  request - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest`

  returns: Result of the UpdateRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest request]
    (-> this (.updateRobotApplication request))))

(defn restart-simulation-job
  "Restarts a running simulation job.

  request - `com.amazonaws.services.robomaker.model.RestartSimulationJobRequest`

  returns: Result of the RestartSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.RestartSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.RestartSimulationJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest request]
    (-> this (.restartSimulationJob request))))

(defn list-deployment-jobs
  "Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
   jobs.

  request - `com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest`

  returns: Result of the ListDeploymentJobs operation returned by the service. - `com.amazonaws.services.robomaker.model.ListDeploymentJobsResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.ListDeploymentJobsResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest request]
    (-> this (.listDeploymentJobs request))))

(defn cancel-simulation-job
  "Cancels the specified simulation job.

  request - `com.amazonaws.services.robomaker.model.CancelSimulationJobRequest`

  returns: Result of the CancelSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CancelSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CancelSimulationJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest request]
    (-> this (.cancelSimulationJob request))))

(defn describe-robot
  "Describes a robot.

  request - `com.amazonaws.services.robomaker.model.DescribeRobotRequest`

  returns: Result of the DescribeRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeRobotResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeRobotResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest request]
    (-> this (.describeRobot request))))

(defn describe-simulation-job
  "Describes a simulation job.

  request - `com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest`

  returns: Result of the DescribeSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeSimulationJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest request]
    (-> this (.describeSimulationJob request))))

(defn describe-fleet
  "Describes a fleet.

  request - `com.amazonaws.services.robomaker.model.DescribeFleetRequest`

  returns: Result of the DescribeFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeFleetResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeFleetResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest request]
    (-> this (.describeFleet request))))

(defn create-robot-application
  "Creates a robot application.

  request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest`

  returns: Result of the CreateRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateRobotApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest request]
    (-> this (.createRobotApplication request))))

(defn list-simulation-applications
  "Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
   applications.

  request - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest`

  returns: Result of the ListSimulationApplications operation returned by the service. - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest request]
    (-> this (.listSimulationApplications request))))

(defn batch-describe-simulation-job
  "Describes one or more simulation jobs.

  request - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest`

  returns: Result of the BatchDescribeSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest request]
    (-> this (.batchDescribeSimulationJob request))))

(defn describe-simulation-application
  "Describes a simulation application.

  request - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest`

  returns: Result of the DescribeSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest request]
    (-> this (.describeSimulationApplication request))))

(defn list-fleets
  "Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.

  request - `com.amazonaws.services.robomaker.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.robomaker.model.ListFleetsResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.ListFleetsResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListFleetsRequest request]
    (-> this (.listFleets request))))

(defn list-robot-applications
  "Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.

  request - `com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest`

  returns: Result of the ListRobotApplications operation returned by the service. - `com.amazonaws.services.robomaker.model.ListRobotApplicationsResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.ListRobotApplicationsResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest request]
    (-> this (.listRobotApplications request))))

(defn create-robot-application-version
  "Creates a version of a robot application.

  request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest`

  returns: Result of the CreateRobotApplicationVersion operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest request]
    (-> this (.createRobotApplicationVersion request))))

(defn update-simulation-application
  "Updates a simulation application.

  request - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest`

  returns: Result of the UpdateSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest request]
    (-> this (.updateSimulationApplication request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSRoboMakerClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-robot
  "Creates a robot.

  request - `com.amazonaws.services.robomaker.model.CreateRobotRequest`

  returns: Result of the CreateRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateRobotResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.CreateRobotRequest request]
    (-> this (.createRobot request))))

(defn sync-deployment-job
  "Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.

  request - `com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest`

  returns: Result of the SyncDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.SyncDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.SyncDeploymentJobResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest request]
    (-> this (.syncDeploymentJob request))))

(defn tag-resource
  "Adds or edits tags for a AWS RoboMaker resource.


   Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
   empty strings.


   For information about the rules that apply to tag keys and tag values, see User-Defined
   Tag Restrictions in the AWS Billing and Cost Management User Guide.

  request - `com.amazonaws.services.robomaker.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.robomaker.model.TagResourceResult`

  throws: com.amazonaws.services.robomaker.model.InternalServerException - AWS RoboMaker experienced a service issue. Try your call again."
  (^com.amazonaws.services.robomaker.model.TagResourceResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn list-robots
  "Returns a list of robots. You can optionally provide filters to retrieve specific robots.

  request - `com.amazonaws.services.robomaker.model.ListRobotsRequest`

  returns: Result of the ListRobots operation returned by the service. - `com.amazonaws.services.robomaker.model.ListRobotsResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.ListRobotsResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.ListRobotsRequest request]
    (-> this (.listRobots request))))

(defn delete-simulation-application
  "Deletes a simulation application.

  request - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest`

  returns: Result of the DeleteSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult [^AWSRoboMakerClient this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest request]
    (-> this (.deleteSimulationApplication request))))

