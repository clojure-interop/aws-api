(ns com.amazonaws.services.serverlessapplicationrepository.AbstractAWSServerlessApplicationRepositoryAsync
  "Abstract implementation of AWSServerlessApplicationRepositoryAsync. Convenient method forms pass through to
  the corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.serverlessapplicationrepository AbstractAWSServerlessApplicationRepositoryAsync]))

(defn list-application-versions-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest request]
    (-> this (.listApplicationVersionsAsync request))))

(defn get-application-policy-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest request]
    (-> this (.getApplicationPolicyAsync request))))

(defn update-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request))))

(defn list-applications-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request))))

(defn get-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest request]
    (-> this (.getApplicationAsync request))))

(defn create-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn delete-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn put-application-policy-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutApplicationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putApplicationPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest request]
    (-> this (.putApplicationPolicyAsync request))))

(defn get-cloud-formation-template-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFormationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFormationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest request]
    (-> this (.getCloudFormationTemplateAsync request))))

(defn list-application-dependencies-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationDependencies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationDependenciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest request]
    (-> this (.listApplicationDependenciesAsync request))))

(defn create-cloud-formation-change-set-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationChangeSet operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest request]
    (-> this (.createCloudFormationChangeSetAsync request))))

(defn create-application-version-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest request]
    (-> this (.createApplicationVersionAsync request))))

(defn create-cloud-formation-template-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest request]
    (-> this (.createCloudFormationTemplateAsync request))))

