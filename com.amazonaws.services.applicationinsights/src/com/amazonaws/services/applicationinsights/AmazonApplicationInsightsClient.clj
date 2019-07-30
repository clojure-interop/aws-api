(ns com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClient
  "Client for accessing Application Insights. All service calls made using this client are blocking, and will not return
  until the service call completes.

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
  (:import [com.amazonaws.services.applicationinsights AmazonApplicationInsightsClient]))

(defn *builder
  "returns: `com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClientBuilder`"
  (^com.amazonaws.services.applicationinsights.AmazonApplicationInsightsClientBuilder []
    (AmazonApplicationInsightsClient/builder )))

(defn update-component
  "Updates the custom component name and/or the list of resources that make up the component.

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentRequest`

  returns: Result of the UpdateComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.UpdateComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceInUseException - The resource is already created or in use."
  (^com.amazonaws.services.applicationinsights.model.UpdateComponentResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.UpdateComponentRequest request]
    (-> this (.updateComponent request))))

(defn describe-application
  "Describes the application.

  request - `com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeApplicationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeApplicationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeApplicationRequest request]
    (-> this (.describeApplication request))))

(defn describe-problem
  "Describes an application problem.

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemRequest`

  returns: Result of the DescribeProblem operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeProblemResult`

  throws: com.amazonaws.services.applicationinsights.model.InternalServerException - The server encountered an internal error and is unable to complete the request."
  (^com.amazonaws.services.applicationinsights.model.DescribeProblemResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeProblemRequest request]
    (-> this (.describeProblem request))))

(defn update-component-configuration
  "Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
   the configuration and should match the schema of what is returned by
   DescribeComponentConfigurationRecommendation.

  request - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest`

  returns: Result of the UpdateComponentConfiguration operation returned by the service. - `com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.UpdateComponentConfigurationRequest request]
    (-> this (.updateComponentConfiguration request))))

(defn describe-observation
  "Describes an anomaly or error with the application.

  request - `com.amazonaws.services.applicationinsights.model.DescribeObservationRequest`

  returns: Result of the DescribeObservation operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeObservationResult`

  throws: com.amazonaws.services.applicationinsights.model.InternalServerException - The server encountered an internal error and is unable to complete the request."
  (^com.amazonaws.services.applicationinsights.model.DescribeObservationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeObservationRequest request]
    (-> this (.describeObservation request))))

(defn delete-application
  "Removes the specified application from monitoring. Does not delete the application.

  request - `com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DeleteApplicationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DeleteApplicationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn describe-component-configuration-recommendation
  "Describes the recommended monitoring configuration of the component.

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest`

  returns: Result of the DescribeComponentConfigurationRecommendation operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRecommendationRequest request]
    (-> this (.describeComponentConfigurationRecommendation request))))

(defn list-applications
  "Lists the IDs of the applications that you are monitoring.

  request - `com.amazonaws.services.applicationinsights.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListApplicationsResult`

  throws: com.amazonaws.services.applicationinsights.model.ValidationException - The parameter is not valid."
  (^com.amazonaws.services.applicationinsights.model.ListApplicationsResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn list-components
  "Lists the auto-grouped, standalone, and custom components of the application.

  request - `com.amazonaws.services.applicationinsights.model.ListComponentsRequest`

  returns: Result of the ListComponents operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListComponentsResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.ListComponentsResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.ListComponentsRequest request]
    (-> this (.listComponents request))))

(defn describe-component-configuration
  "Describes the monitoring configuration of the component.

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest`

  returns: Result of the DescribeComponentConfiguration operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentConfigurationRequest request]
    (-> this (.describeComponentConfiguration request))))

(defn delete-component
  "Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
   component are removed and the instances revert to their standalone status.

  request - `com.amazonaws.services.applicationinsights.model.DeleteComponentRequest`

  returns: Result of the DeleteComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DeleteComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DeleteComponentResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DeleteComponentRequest request]
    (-> this (.deleteComponent request))))

(defn create-component
  "Creates a custom component by grouping similar standalone instances to monitor.

  request - `com.amazonaws.services.applicationinsights.model.CreateComponentRequest`

  returns: Result of the CreateComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.CreateComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceInUseException - The resource is already created or in use."
  (^com.amazonaws.services.applicationinsights.model.CreateComponentResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.CreateComponentRequest request]
    (-> this (.createComponent request))))

(defn create-application
  "Adds an application that is created from a resource group.

  request - `com.amazonaws.services.applicationinsights.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.applicationinsights.model.CreateApplicationResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceInUseException - The resource is already created or in use."
  (^com.amazonaws.services.applicationinsights.model.CreateApplicationResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn describe-problem-observations
  "Describes the anomalies or errors associated with the problem.

  request - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest`

  returns: Result of the DescribeProblemObservations operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult`

  throws: com.amazonaws.services.applicationinsights.model.InternalServerException - The server encountered an internal error and is unable to complete the request."
  (^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeProblemObservationsRequest request]
    (-> this (.describeProblemObservations request))))

(defn list-problems
  "Lists the problems with your application.

  request - `com.amazonaws.services.applicationinsights.model.ListProblemsRequest`

  returns: Result of the ListProblems operation returned by the service. - `com.amazonaws.services.applicationinsights.model.ListProblemsResult`

  throws: com.amazonaws.services.applicationinsights.model.ValidationException - The parameter is not valid."
  (^com.amazonaws.services.applicationinsights.model.ListProblemsResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.ListProblemsRequest request]
    (-> this (.listProblems request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApplicationInsightsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-component
  "Describes a component and lists the resources that are grouped together in a component.

  request - `com.amazonaws.services.applicationinsights.model.DescribeComponentRequest`

  returns: Result of the DescribeComponent operation returned by the service. - `com.amazonaws.services.applicationinsights.model.DescribeComponentResult`

  throws: com.amazonaws.services.applicationinsights.model.ResourceNotFoundException - The resource does not exist in the customer account."
  (^com.amazonaws.services.applicationinsights.model.DescribeComponentResult [^AmazonApplicationInsightsClient this ^com.amazonaws.services.applicationinsights.model.DescribeComponentRequest request]
    (-> this (.describeComponent request))))

