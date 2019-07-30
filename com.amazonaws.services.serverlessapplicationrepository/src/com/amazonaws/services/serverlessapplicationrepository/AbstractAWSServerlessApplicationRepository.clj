(ns com.amazonaws.services.serverlessapplicationrepository.AbstractAWSServerlessApplicationRepository
  "Abstract implementation of AWSServerlessApplicationRepository. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.serverlessapplicationrepository AbstractAWSServerlessApplicationRepository]))

(defn create-cloud-formation-change-set
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest`

  returns: Result of the CreateCloudFormationChangeSet operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest request]
    (-> this (.createCloudFormationChangeSet request))))

(defn list-application-versions
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest`

  returns: Result of the ListApplicationVersions operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest request]
    (-> this (.listApplicationVersions request))))

(defn get-application-policy
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest`

  returns: Result of the GetApplicationPolicy operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest request]
    (-> this (.getApplicationPolicy request))))

(defn create-cloud-formation-template
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest`

  returns: Result of the CreateCloudFormationTemplate operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest request]
    (-> this (.createCloudFormationTemplate request))))

(defn get-cloud-formation-template
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest`

  returns: Result of the GetCloudFormationTemplate operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest request]
    (-> this (.getCloudFormationTemplate request))))

(defn delete-application
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn create-application-version
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest`

  returns: Result of the CreateApplicationVersion operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest request]
    (-> this (.createApplicationVersion request))))

(defn list-applications
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn shutdown
  "Description copied from interface: AWSServerlessApplicationRepository"
  ([^AbstractAWSServerlessApplicationRepository this]
    (-> this (.shutdown))))

(defn list-application-dependencies
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest`

  returns: Result of the ListApplicationDependencies operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest request]
    (-> this (.listApplicationDependencies request))))

(defn update-application
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn create-application
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn get-application
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest`

  returns: Result of the GetApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest request]
    (-> this (.getApplication request))))

(defn put-application-policy
  "Description copied from interface: AWSServerlessApplicationRepository

  request - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest`

  returns: Result of the PutApplicationPolicy operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult`"
  (^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest request]
    (-> this (.putApplicationPolicy request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSServerlessApplicationRepository

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSServerlessApplicationRepository this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

