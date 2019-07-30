(ns com.amazonaws.services.robomaker.AWSRoboMaker
  "Interface for accessing RoboMaker.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSRoboMaker instead.



  This section provides documentation for the AWS RoboMaker API operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.robomaker AWSRoboMaker]))

(defn describe-robot-application
  "Describes a robot application.

  describe-robot-application-request - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest`

  returns: Result of the DescribeRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DescribeRobotApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeRobotApplicationRequest describe-robot-application-request]
    (-> this (.describeRobotApplication describe-robot-application-request))))

(defn list-tags-for-resource
  "Lists all tags on a AWS RoboMaker resource.

  list-tags-for-resource-request - `com.amazonaws.services.robomaker.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.robomaker.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.robomaker.model.InternalServerException - AWS RoboMaker experienced a service issue. Try your call again."
  (^com.amazonaws.services.robomaker.model.ListTagsForResourceResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn delete-fleet
  "Deletes a fleet.

  delete-fleet-request - `com.amazonaws.services.robomaker.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteFleetResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteFleetResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteFleetRequest delete-fleet-request]
    (-> this (.deleteFleet delete-fleet-request))))

(defn delete-robot-application
  "Deletes a robot application.

  delete-robot-application-request - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest`

  returns: Result of the DeleteRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteRobotApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteRobotApplicationRequest delete-robot-application-request]
    (-> this (.deleteRobotApplication delete-robot-application-request))))

(defn deregister-robot
  "Deregisters a robot.

  deregister-robot-request - `com.amazonaws.services.robomaker.model.DeregisterRobotRequest`

  returns: Result of the DeregisterRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DeregisterRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeregisterRobotResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeregisterRobotRequest deregister-robot-request]
    (-> this (.deregisterRobot deregister-robot-request))))

(defn create-simulation-job
  "Creates a simulation job.



   After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.

  create-simulation-job-request - `com.amazonaws.services.robomaker.model.CreateSimulationJobRequest`

  returns: Result of the CreateSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CreateSimulationJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateSimulationJobRequest create-simulation-job-request]
    (-> this (.createSimulationJob create-simulation-job-request))))

(defn create-simulation-application-version
  "Creates a simulation application with a specific revision id.

  create-simulation-application-version-request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest`

  returns: Result of the CreateSimulationApplicationVersion operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationVersionRequest create-simulation-application-version-request]
    (-> this (.createSimulationApplicationVersion create-simulation-application-version-request))))

(defn delete-robot
  "Deletes a robot.

  delete-robot-request - `com.amazonaws.services.robomaker.model.DeleteRobotRequest`

  returns: Result of the DeleteRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteRobotResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteRobotRequest delete-robot-request]
    (-> this (.deleteRobot delete-robot-request))))

(defn register-robot
  "Registers a robot with a fleet.

  register-robot-request - `com.amazonaws.services.robomaker.model.RegisterRobotRequest`

  returns: Result of the RegisterRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.RegisterRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.RegisterRobotResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.RegisterRobotRequest register-robot-request]
    (-> this (.registerRobot register-robot-request))))

(defn describe-deployment-job
  "Describes a deployment job.

  describe-deployment-job-request - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest`

  returns: Result of the DescribeDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeDeploymentJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeDeploymentJobRequest describe-deployment-job-request]
    (-> this (.describeDeploymentJob describe-deployment-job-request))))

(defn untag-resource
  "Removes the specified tags from the specified AWS RoboMaker resource.


   To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource .

  untag-resource-request - `com.amazonaws.services.robomaker.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.robomaker.model.UntagResourceResult`

  throws: com.amazonaws.services.robomaker.model.InternalServerException - AWS RoboMaker experienced a service issue. Try your call again."
  (^com.amazonaws.services.robomaker.model.UntagResourceResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-simulation-jobs
  "Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.

  list-simulation-jobs-request - `com.amazonaws.services.robomaker.model.ListSimulationJobsRequest`

  returns: Result of the ListSimulationJobs operation returned by the service. - `com.amazonaws.services.robomaker.model.ListSimulationJobsResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.ListSimulationJobsResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListSimulationJobsRequest list-simulation-jobs-request]
    (-> this (.listSimulationJobs list-simulation-jobs-request))))

(defn create-fleet
  "Creates a fleet, a logical group of robots running the same robot application.

  create-fleet-request - `com.amazonaws.services.robomaker.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateFleetResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateFleetResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleet create-fleet-request))))

(defn create-deployment-job
  "Deploys a specific version of a robot application to robots in a fleet.


   The robot application must have a numbered applicationVersion for consistency reasons. To create a
   new version, use CreateRobotApplicationVersion or see Creating a Robot
   Application Version.



   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.

  create-deployment-job-request - `com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest`

  returns: Result of the CreateDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CreateDeploymentJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateDeploymentJobRequest create-deployment-job-request]
    (-> this (.createDeploymentJob create-deployment-job-request))))

(defn cancel-deployment-job
  "Cancels the specified deployment job.

  cancel-deployment-job-request - `com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest`

  returns: Result of the CancelDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CancelDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CancelDeploymentJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CancelDeploymentJobRequest cancel-deployment-job-request]
    (-> this (.cancelDeploymentJob cancel-deployment-job-request))))

(defn create-simulation-application
  "Creates a simulation application.

  create-simulation-application-request - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest`

  returns: Result of the CreateSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateSimulationApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateSimulationApplicationRequest create-simulation-application-request]
    (-> this (.createSimulationApplication create-simulation-application-request))))

(defn update-robot-application
  "Updates a robot application.

  update-robot-application-request - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest`

  returns: Result of the UpdateRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.UpdateRobotApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.UpdateRobotApplicationRequest update-robot-application-request]
    (-> this (.updateRobotApplication update-robot-application-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSRoboMaker this]
    (-> this (.shutdown))))

(defn restart-simulation-job
  "Restarts a running simulation job.

  restart-simulation-job-request - `com.amazonaws.services.robomaker.model.RestartSimulationJobRequest`

  returns: Result of the RestartSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.RestartSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.RestartSimulationJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.RestartSimulationJobRequest restart-simulation-job-request]
    (-> this (.restartSimulationJob restart-simulation-job-request))))

(defn list-deployment-jobs
  "Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
   jobs.

  list-deployment-jobs-request - `com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest`

  returns: Result of the ListDeploymentJobs operation returned by the service. - `com.amazonaws.services.robomaker.model.ListDeploymentJobsResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.ListDeploymentJobsResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListDeploymentJobsRequest list-deployment-jobs-request]
    (-> this (.listDeploymentJobs list-deployment-jobs-request))))

(defn cancel-simulation-job
  "Cancels the specified simulation job.

  cancel-simulation-job-request - `com.amazonaws.services.robomaker.model.CancelSimulationJobRequest`

  returns: Result of the CancelSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.CancelSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.CancelSimulationJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CancelSimulationJobRequest cancel-simulation-job-request]
    (-> this (.cancelSimulationJob cancel-simulation-job-request))))

(defn describe-robot
  "Describes a robot.

  describe-robot-request - `com.amazonaws.services.robomaker.model.DescribeRobotRequest`

  returns: Result of the DescribeRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeRobotResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeRobotResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeRobotRequest describe-robot-request]
    (-> this (.describeRobot describe-robot-request))))

(defn describe-simulation-job
  "Describes a simulation job.

  describe-simulation-job-request - `com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest`

  returns: Result of the DescribeSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeSimulationJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeSimulationJobRequest describe-simulation-job-request]
    (-> this (.describeSimulationJob describe-simulation-job-request))))

(defn describe-fleet
  "Describes a fleet.

  describe-fleet-request - `com.amazonaws.services.robomaker.model.DescribeFleetRequest`

  returns: Result of the DescribeFleet operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeFleetResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.DescribeFleetResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeFleetRequest describe-fleet-request]
    (-> this (.describeFleet describe-fleet-request))))

(defn create-robot-application
  "Creates a robot application.

  create-robot-application-request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest`

  returns: Result of the CreateRobotApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateRobotApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationRequest create-robot-application-request]
    (-> this (.createRobotApplication create-robot-application-request))))

(defn list-simulation-applications
  "Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
   applications.

  list-simulation-applications-request - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest`

  returns: Result of the ListSimulationApplications operation returned by the service. - `com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.ListSimulationApplicationsResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListSimulationApplicationsRequest list-simulation-applications-request]
    (-> this (.listSimulationApplications list-simulation-applications-request))))

(defn batch-describe-simulation-job
  "Describes one or more simulation jobs.

  batch-describe-simulation-job-request - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest`

  returns: Result of the BatchDescribeSimulationJob operation returned by the service. - `com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.BatchDescribeSimulationJobRequest batch-describe-simulation-job-request]
    (-> this (.batchDescribeSimulationJob batch-describe-simulation-job-request))))

(defn describe-simulation-application
  "Describes a simulation application.

  describe-simulation-application-request - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest`

  returns: Result of the DescribeSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DescribeSimulationApplicationRequest describe-simulation-application-request]
    (-> this (.describeSimulationApplication describe-simulation-application-request))))

(defn list-fleets
  "Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.

  list-fleets-request - `com.amazonaws.services.robomaker.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.robomaker.model.ListFleetsResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.ListFleetsResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListFleetsRequest list-fleets-request]
    (-> this (.listFleets list-fleets-request))))

(defn list-robot-applications
  "Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.

  list-robot-applications-request - `com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest`

  returns: Result of the ListRobotApplications operation returned by the service. - `com.amazonaws.services.robomaker.model.ListRobotApplicationsResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.ListRobotApplicationsResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListRobotApplicationsRequest list-robot-applications-request]
    (-> this (.listRobotApplications list-robot-applications-request))))

(defn create-robot-application-version
  "Creates a version of a robot application.

  create-robot-application-version-request - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest`

  returns: Result of the CreateRobotApplicationVersion operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateRobotApplicationVersionRequest create-robot-application-version-request]
    (-> this (.createRobotApplicationVersion create-robot-application-version-request))))

(defn update-simulation-application
  "Updates a simulation application.

  update-simulation-application-request - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest`

  returns: Result of the UpdateSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.UpdateSimulationApplicationRequest update-simulation-application-request]
    (-> this (.updateSimulationApplication update-simulation-application-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSRoboMaker this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-robot
  "Creates a robot.

  create-robot-request - `com.amazonaws.services.robomaker.model.CreateRobotRequest`

  returns: Result of the CreateRobot operation returned by the service. - `com.amazonaws.services.robomaker.model.CreateRobotResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.CreateRobotResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.CreateRobotRequest create-robot-request]
    (-> this (.createRobot create-robot-request))))

(defn sync-deployment-job
  "Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.

  sync-deployment-job-request - `com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest`

  returns: Result of the SyncDeploymentJob operation returned by the service. - `com.amazonaws.services.robomaker.model.SyncDeploymentJobResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.SyncDeploymentJobResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.SyncDeploymentJobRequest sync-deployment-job-request]
    (-> this (.syncDeploymentJob sync-deployment-job-request))))

(defn tag-resource
  "Adds or edits tags for a AWS RoboMaker resource.


   Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
   empty strings.


   For information about the rules that apply to tag keys and tag values, see User-Defined
   Tag Restrictions in the AWS Billing and Cost Management User Guide.

  tag-resource-request - `com.amazonaws.services.robomaker.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.robomaker.model.TagResourceResult`

  throws: com.amazonaws.services.robomaker.model.InternalServerException - AWS RoboMaker experienced a service issue. Try your call again."
  (^com.amazonaws.services.robomaker.model.TagResourceResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn list-robots
  "Returns a list of robots. You can optionally provide filters to retrieve specific robots.

  list-robots-request - `com.amazonaws.services.robomaker.model.ListRobotsRequest`

  returns: Result of the ListRobots operation returned by the service. - `com.amazonaws.services.robomaker.model.ListRobotsResult`

  throws: com.amazonaws.services.robomaker.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.robomaker.model.ListRobotsResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.ListRobotsRequest list-robots-request]
    (-> this (.listRobots list-robots-request))))

(defn delete-simulation-application
  "Deletes a simulation application.

  delete-simulation-application-request - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest`

  returns: Result of the DeleteSimulationApplication operation returned by the service. - `com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult`

  throws: com.amazonaws.services.robomaker.model.InvalidParameterException - A parameter specified in a request is not valid, is unsupported, or cannot be used. The returned message provides an explanation of the error value."
  (^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationResult [^AWSRoboMaker this ^com.amazonaws.services.robomaker.model.DeleteSimulationApplicationRequest delete-simulation-application-request]
    (-> this (.deleteSimulationApplication delete-simulation-application-request))))

