(ns com.amazonaws.services.applicationinsights.AmazonApplicationInsights
  "Interface for accessing Application Insights.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApplicationInsights instead.


  Amazon CloudWatch Application Insights for .NET and SQL Server

  Amazon CloudWatch Application Insights for .NET and SQL Server is a service that helps you detect common problems
  with your .NET and SQL Server-based applications. It enables you to pinpoint the source of issues in your
  applications (built with technologies such as Microsoft IIS, .NET, and Microsoft SQL Server), by providing key
  insights into detected problems.


  After you onboard your application, CloudWatch Application Insights for .NET and SQL Server identifies, recommends,
  and sets up metrics and logs. It continuously analyzes and correlates your metrics and logs for unusual behavior to
  surface actionable problems with your application. For example, if your application is slow and unresponsive and
  leading to HTTP 500 errors in your Application Load Balancer (ALB), Application Insights informs you that a memory
  pressure problem with your SQL Server database is occurring. It bases this analysis on impactful metrics and log
  errors."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationinsights AmazonApplicationInsights]))

(defn update-component
  "Updates the custom component name and/or the list of resources that make up the component.

  update-component-request - `com.amazonaws.services.applicationinsights.model.UpdateComponentRequest`

  returns: Result of the UpdateComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.UpdateComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceInUseException - The resource is already created or in use."
  (^com.amazonaws.services.applicationinsights.model.UpdateComponentResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest update-component-request]
    (-> this (.updateComponent update-component-request))))

(defn describe-application
  "Describes the application.

  describe-application-request - `com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeApplicationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeApplicationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest describe-application-request]
    (-> this (.describeApplication describe-application-request))))

(defn describe-problem
  "Describes an application problem.

  describe-problem-request - `com.amazonaws.services.applicationinsights.model.DescribeProblemRequest`

  returns: Result of the DescribeProblem operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeProblemResult`

  throws: com.amazonaws.services.applicationinsights.model.InternalServerException - The server encountered an internal error and is unable to complete the request."
  (^com.amazonaws.services.applicationinsights.model.DescribeProblemResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest describe-problem-request]
    (-> this (.describeProblem describe-problem-request))))

(defn update-component-configuration
  "Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
   the configuration and should match the schema of what is returned by
   DescribeComponentConfigurationRecommendation.

  update-component-configuration-request - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest`

  returns: Result of the UpdateComponentConfiguration operation returned by the service. - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest update-component-configuration-request]
    (-> this (.updateComponentConfiguration update-component-configuration-request))))

(defn describe-observation
  "Describes an anomaly or error with the application.

  describe-observation-request - `com.amazonaws.services.applicationinsights.model.DescribeObservationRequest`

  returns: Result of the DescribeObservation operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeObservationResult`

  throws: com.amazonaws.services.applicationinsights.model.InternalServerException - The server encountered an internal error and is unable to complete the request."
  (^com.amazonaws.services.applicationinsights.model.DescribeObservationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest describe-observation-request]
    (-> this (.describeObservation describe-observation-request))))

(defn delete-application
  "Removes the specified application from monitoring. Does not delete the application.

  delete-application-request - `com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DeleteApplicationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DeleteApplicationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplication delete-application-request))))

(defn describe-component-configuration-recommendation
  "Describes the recommended monitoring configuration of the component.

  describe-component-configuration-recommendation-request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest`

  returns: Result of the DescribeComponentConfigurationRecommendation operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest describe-component-configuration-recommendation-request]
    (-> this (.describeComponentConfigurationRecommendation describe-component-configuration-recommendation-request))))

(defn list-applications
  "Lists the IDs of the applications that you are monitoring.

  list-applications-request - `com.amazonaws.services.applicationinsights.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListApplicationsResult`

  throws: com.amazonaws.services.applicationinsights.model.ValidationException - The parameter is not valid."
  (^com.amazonaws.services.applicationinsights.model.ListApplicationsResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplications list-applications-request))))

(defn list-components
  "Lists the auto-grouped, standalone, and custom components of the application.

  list-components-request - `com.amazonaws.services.applicationinsights.model.ListComponentsRequest`

  returns: Result of the ListComponents operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListComponentsResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.ListComponentsResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest list-components-request]
    (-> this (.listComponents list-components-request))))

(defn describe-component-configuration
  "Describes the monitoring configuration of the component.

  describe-component-configuration-request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest`

  returns: Result of the DescribeComponentConfiguration operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest describe-component-configuration-request]
    (-> this (.describeComponentConfiguration describe-component-configuration-request))))

(defn delete-component
  "Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
   component are removed and the instances revert to their standalone status.

  delete-component-request - `com.amazonaws.services.applicationinsights.model.DeleteComponentRequest`

  returns: Result of the DeleteComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DeleteComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DeleteComponentResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest delete-component-request]
    (-> this (.deleteComponent delete-component-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonApplicationInsights this]
    (-> this (.shutdown))))

(defn create-component
  "Creates a custom component by grouping similar standalone instances to monitor.

  create-component-request - `com.amazonaws.services.applicationinsights.model.CreateComponentRequest`

  returns: Result of the CreateComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.CreateComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceInUseException - The resource is already created or in use."
  (^com.amazonaws.services.applicationinsights.model.CreateComponentResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest create-component-request]
    (-> this (.createComponent create-component-request))))

(defn create-application
  "Adds an application that is created from a resource group.

  create-application-request - `com.amazonaws.services.applicationinsights.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.CreateApplicationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceInUseException - The resource is already created or in use."
  (^com.amazonaws.services.applicationinsights.model.CreateApplicationResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplication create-application-request))))

(defn describe-problem-observations
  "Describes the anomalies or errors associated with the problem.

  describe-problem-observations-request - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest`

  returns: Result of the DescribeProblemObservations operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult`

  throws: com.amazonaws.services.applicationinsights.model.InternalServerException - The server encountered an internal error and is unable to complete the request."
  (^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest describe-problem-observations-request]
    (-> this (.describeProblemObservations describe-problem-observations-request))))

(defn list-problems
  "Lists the problems with your application.

  list-problems-request - `com.amazonaws.services.applicationinsights.model.ListProblemsRequest`

  returns: Result of the ListProblems operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListProblemsResult`

  throws: com.amazonaws.services.applicationinsights.model.ValidationException - The parameter is not valid."
  (^com.amazonaws.services.applicationinsights.model.ListProblemsResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest list-problems-request]
    (-> this (.listProblems list-problems-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApplicationInsights this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-component
  "Describes a component and lists the resources that are grouped together in a component.

  describe-component-request - `com.amazonaws.services.applicationinsights.model.DescribeComponentRequest`

  returns: Result of the DescribeComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentResult [^AmazonApplicationInsights this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest describe-component-request]
    (-> this (.describeComponent describe-component-request))))

