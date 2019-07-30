(ns com.amazonaws.services.amplify.AWSAmplifyAsync
  "Interface for accessing Amplify asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAmplifyAsync instead.



  Amplify is a fully managed continuous deployment and hosting service for modern web apps."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AWSAmplifyAsync]))

(defn untag-resource-async
  "Untag resource with resourceArn.

  untag-resource-request - Request structure used to untag resource. - `com.amazonaws.services.amplify.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-app-async
  "Retrieves an existing Amplify App by appId.

  get-app-request - Request structure for get App request. - `com.amazonaws.services.amplify.model.GetAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetAppResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetAppRequest get-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAppAsync get-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetAppRequest get-app-request]
    (-> this (.getAppAsync get-app-request))))

(defn create-branch-async
  "Creates a new Branch for an Amplify App.

  create-branch-request - Request structure for a branch create request. - `com.amazonaws.services.amplify.model.CreateBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateBranchResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateBranchRequest create-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBranchAsync create-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateBranchRequest create-branch-request]
    (-> this (.createBranchAsync create-branch-request))))

(defn delete-job-async
  "Delete a job, for an Amplify branch, part of Amplify App.

  delete-job-request - Request structure for delete job request. - `com.amazonaws.services.amplify.model.DeleteJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteJobResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteJobRequest delete-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobAsync delete-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteJobRequest delete-job-request]
    (-> this (.deleteJobAsync delete-job-request))))

(defn delete-app-async
  "Delete an existing Amplify App by appId.

  delete-app-request - Request structure for an Amplify App delete request. - `com.amazonaws.services.amplify.model.DeleteAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteAppRequest delete-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync delete-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteAppAsync delete-app-request))))

(defn delete-domain-association-async
  "Deletes a DomainAssociation.

  delete-domain-association-request - Request structure for the delete Domain Association request. - `com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest delete-domain-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAssociationAsync delete-domain-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteDomainAssociationRequest delete-domain-association-request]
    (-> this (.deleteDomainAssociationAsync delete-domain-association-request))))

(defn get-webhook-async
  "Retrieves webhook info that corresponds to a webhookId.

  get-webhook-request - Request structure for the get webhook request. - `com.amazonaws.services.amplify.model.GetWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetWebhookResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetWebhookRequest get-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWebhookAsync get-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetWebhookRequest get-webhook-request]
    (-> this (.getWebhookAsync get-webhook-request))))

(defn list-jobs-async
  "List Jobs for a branch, part of an Amplify App.

  list-jobs-request - Request structure for list job request. - `com.amazonaws.services.amplify.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn update-app-async
  "Updates an existing Amplify App.

  update-app-request - Request structure for update App request. - `com.amazonaws.services.amplify.model.UpdateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateAppResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateAppRequest update-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAppAsync update-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateAppRequest update-app-request]
    (-> this (.updateAppAsync update-app-request))))

(defn delete-branch-async
  "Deletes a branch for an Amplify App.

  delete-branch-request - Request structure for delete branch request. - `com.amazonaws.services.amplify.model.DeleteBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteBranchResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteBranchRequest delete-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBranchAsync delete-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteBranchRequest delete-branch-request]
    (-> this (.deleteBranchAsync delete-branch-request))))

(defn create-webhook-async
  "Create a new webhook on an App.

  create-webhook-request - Request structure for create webhook request. - `com.amazonaws.services.amplify.model.CreateWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateWebhookResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateWebhookRequest create-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWebhookAsync create-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateWebhookRequest create-webhook-request]
    (-> this (.createWebhookAsync create-webhook-request))))

(defn list-apps-async
  "Lists existing Amplify Apps.

  list-apps-request - Request structure for an Amplify App list request. - `com.amazonaws.services.amplify.model.ListAppsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListAppsResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListAppsRequest list-apps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAppsAsync list-apps-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListAppsRequest list-apps-request]
    (-> this (.listAppsAsync list-apps-request))))

(defn list-branches-async
  "Lists branches for an Amplify App.

  list-branches-request - Request structure for list branches request. - `com.amazonaws.services.amplify.model.ListBranchesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBranches operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListBranchesResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListBranchesRequest list-branches-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBranchesAsync list-branches-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListBranchesRequest list-branches-request]
    (-> this (.listBranchesAsync list-branches-request))))

(defn update-webhook-async
  "Update a webhook.

  update-webhook-request - Request structure for update webhook request. - `com.amazonaws.services.amplify.model.UpdateWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateWebhookResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest update-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWebhookAsync update-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateWebhookRequest update-webhook-request]
    (-> this (.updateWebhookAsync update-webhook-request))))

(defn delete-webhook-async
  "Deletes a webhook.

  delete-webhook-request - Request structure for the delete webhook request. - `com.amazonaws.services.amplify.model.DeleteWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest delete-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync delete-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.DeleteWebhookRequest delete-webhook-request]
    (-> this (.deleteWebhookAsync delete-webhook-request))))

(defn update-domain-association-async
  "Create a new DomainAssociation on an App

  update-domain-association-request - Request structure for update Domain Association request. - `com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest update-domain-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainAssociationAsync update-domain-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateDomainAssociationRequest update-domain-association-request]
    (-> this (.updateDomainAssociationAsync update-domain-association-request))))

(defn get-branch-async
  "Retrieves a branch for an Amplify App.

  get-branch-request - Result structure for get branch request. - `com.amazonaws.services.amplify.model.GetBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetBranchResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetBranchRequest get-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBranchAsync get-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetBranchRequest get-branch-request]
    (-> this (.getBranchAsync get-branch-request))))

(defn list-domain-associations-async
  "List domains with an app

  list-domain-associations-request - Request structure for the list Domain Associations request. - `com.amazonaws.services.amplify.model.ListDomainAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainAssociations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListDomainAssociationsResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest list-domain-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainAssociationsAsync list-domain-associations-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListDomainAssociationsRequest list-domain-associations-request]
    (-> this (.listDomainAssociationsAsync list-domain-associations-request))))

(defn start-job-async
  "Starts a new job for a branch, part of an Amplify App.

  start-job-request - Request structure for Start job request. - `com.amazonaws.services.amplify.model.StartJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.StartJobResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartJobRequest start-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startJobAsync start-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartJobRequest start-job-request]
    (-> this (.startJobAsync start-job-request))))

(defn list-tags-for-resource-async
  "List tags for resource.

  list-tags-for-resource-request - Request structure used to list tags for resource. - `com.amazonaws.services.amplify.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-domain-association-async
  "Create a new DomainAssociation on an App

  create-domain-association-request - Request structure for create Domain Association request. - `com.amazonaws.services.amplify.model.CreateDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest create-domain-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAssociationAsync create-domain-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDomainAssociationRequest create-domain-association-request]
    (-> this (.createDomainAssociationAsync create-domain-association-request))))

(defn update-branch-async
  "Updates a branch for an Amplify App.

  update-branch-request - Request structure for update branch request. - `com.amazonaws.services.amplify.model.UpdateBranchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBranch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.UpdateBranchResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateBranchRequest update-branch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBranchAsync update-branch-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.UpdateBranchRequest update-branch-request]
    (-> this (.updateBranchAsync update-branch-request))))

(defn create-deployment-async
  "Create a deployment for manual deploy apps. (Apps are not connected to repository)

  create-deployment-request - Request structure for create a new deployment. - `com.amazonaws.services.amplify.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest create-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync create-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeploymentAsync create-deployment-request))))

(defn get-domain-association-async
  "Retrieves domain info that corresponds to an appId and domainName.

  get-domain-association-request - Request structure for the get Domain Association request. - `com.amazonaws.services.amplify.model.GetDomainAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetDomainAssociationResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest get-domain-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainAssociationAsync get-domain-association-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetDomainAssociationRequest get-domain-association-request]
    (-> this (.getDomainAssociationAsync get-domain-association-request))))

(defn create-app-async
  "Creates a new Amplify App.

  create-app-request - Request structure used to create Apps in Amplify. - `com.amazonaws.services.amplify.model.CreateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateAppRequest create-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync create-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.CreateAppRequest create-app-request]
    (-> this (.createAppAsync create-app-request))))

(defn list-webhooks-async
  "List webhooks with an app.

  list-webhooks-request - Request structure for the list webhooks request. - `com.amazonaws.services.amplify.model.ListWebhooksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebhooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.ListWebhooksResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListWebhooksRequest list-webhooks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebhooksAsync list-webhooks-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.ListWebhooksRequest list-webhooks-request]
    (-> this (.listWebhooksAsync list-webhooks-request))))

(defn tag-resource-async
  "Tag resource with tag key and value.

  tag-resource-request - Request structure used to tag resource. - `com.amazonaws.services.amplify.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn get-job-async
  "Get a job for a branch, part of an Amplify App.

  get-job-request - Request structure for get job request. - `com.amazonaws.services.amplify.model.GetJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetJobRequest get-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync get-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.GetJobRequest get-job-request]
    (-> this (.getJobAsync get-job-request))))

(defn stop-job-async
  "Stop a job that is in progress, for an Amplify branch, part of Amplify App.

  stop-job-request - Request structure for stop job request. - `com.amazonaws.services.amplify.model.StopJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.StopJobResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StopJobRequest stop-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopJobAsync stop-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StopJobRequest stop-job-request]
    (-> this (.stopJobAsync stop-job-request))))

(defn start-deployment-async
  "Start a deployment for manual deploy apps. (Apps are not connected to repository)

  start-deployment-request - Request structure for start a deployment. - `com.amazonaws.services.amplify.model.StartDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.amplify.model.StartDeploymentResult>`"
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartDeploymentRequest start-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDeploymentAsync start-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AWSAmplifyAsync this ^com.amazonaws.services.amplify.model.StartDeploymentRequest start-deployment-request]
    (-> this (.startDeploymentAsync start-deployment-request))))

