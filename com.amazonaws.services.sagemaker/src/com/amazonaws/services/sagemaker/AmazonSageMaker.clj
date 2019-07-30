(ns com.amazonaws.services.sagemaker.AmazonSageMaker
  "Interface for accessing SageMaker.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSageMaker instead.



  Provides APIs for creating and managing Amazon SageMaker resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemaker AmazonSageMaker]))

(defn describe-algorithm
  "Returns a description of the specified algorithm that is in your account.

  describe-algorithm-request - `com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest`

  returns: Result of the DescribeAlgorithm operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeAlgorithmResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeAlgorithmResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest describe-algorithm-request]
    (-> this (.describeAlgorithm describe-algorithm-request))))

(defn describe-compilation-job
  "Returns information about a model compilation job.


   To create a model compilation job, use CreateCompilationJob. To get information about multiple model
   compilation jobs, use ListCompilationJobs.

  describe-compilation-job-request - `com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest`

  returns: Result of the DescribeCompilationJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeCompilationJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.DescribeCompilationJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest describe-compilation-job-request]
    (-> this (.describeCompilationJob describe-compilation-job-request))))

(defn list-model-packages
  "Lists the model packages that have been created.

  list-model-packages-request - `com.amazonaws.services.sagemaker.model.ListModelPackagesRequest`

  returns: Result of the ListModelPackages operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListModelPackagesResult`"
  (^com.amazonaws.services.sagemaker.model.ListModelPackagesResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListModelPackagesRequest list-model-packages-request]
    (-> this (.listModelPackages list-model-packages-request))))

(defn delete-tags
  "Deletes the specified tags from an Amazon SageMaker resource.


   To list a resource's tags, use the ListTags API.



   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from
   training jobs that the hyperparameter tuning job launched before you called this API.

  delete-tags-request - `com.amazonaws.services.sagemaker.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteTagsResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteTagsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn add-tags
  "Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
   instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams,
   endpoint configurations, and endpoints.


   Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
   about tags, see For more information, see AWS Tagging Strategies.



   Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the
   hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter
   tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter
   tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you
   first create the tuning job by specifying them in the Tags parameter of
   CreateHyperParameterTuningJob

  add-tags-request - `com.amazonaws.services.sagemaker.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.sagemaker.model.AddTagsResult`"
  (^com.amazonaws.services.sagemaker.model.AddTagsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn update-endpoint-weights-and-capacities
  "Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant
   associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to
   Updating. After updating the endpoint, it sets the status to InService. To check the
   status of an endpoint, use the DescribeEndpoint API.

  update-endpoint-weights-and-capacities-request - `com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest`

  returns: Result of the UpdateEndpointWeightsAndCapacities operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest update-endpoint-weights-and-capacities-request]
    (-> this (.updateEndpointWeightsAndCapacities update-endpoint-weights-and-capacities-request))))

(defn list-workteams
  "Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the
   filter specified in the NameContains parameter.

  list-workteams-request - `com.amazonaws.services.sagemaker.model.ListWorkteamsRequest`

  returns: Result of the ListWorkteams operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListWorkteamsResult`"
  (^com.amazonaws.services.sagemaker.model.ListWorkteamsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListWorkteamsRequest list-workteams-request]
    (-> this (.listWorkteams list-workteams-request))))

(defn create-workteam
  "Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools.
   You must first create the user pools before you can create a work team.


   You cannot create more than 25 work teams in an account and region.

  create-workteam-request - `com.amazonaws.services.sagemaker.model.CreateWorkteamRequest`

  returns: Result of the CreateWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateWorkteamResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceInUseException - Resource being accessed is in use."
  (^com.amazonaws.services.sagemaker.model.CreateWorkteamResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateWorkteamRequest create-workteam-request]
    (-> this (.createWorkteam create-workteam-request))))

(defn list-endpoints
  "Lists endpoints.

  list-endpoints-request - `com.amazonaws.services.sagemaker.model.ListEndpointsRequest`

  returns: Result of the ListEndpoints operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListEndpointsResult`"
  (^com.amazonaws.services.sagemaker.model.ListEndpointsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListEndpointsRequest list-endpoints-request]
    (-> this (.listEndpoints list-endpoints-request))))

(defn delete-endpoint-config
  "Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified
   configuration. It does not delete endpoints created using the configuration.

  delete-endpoint-config-request - `com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest`

  returns: Result of the DeleteEndpointConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest delete-endpoint-config-request]
    (-> this (.deleteEndpointConfig delete-endpoint-config-request))))

(defn list-hyper-parameter-tuning-jobs
  "Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs
   launched in your account.

  list-hyper-parameter-tuning-jobs-request - `com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest`

  returns: Result of the ListHyperParameterTuningJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest list-hyper-parameter-tuning-jobs-request]
    (-> this (.listHyperParameterTuningJobs list-hyper-parameter-tuning-jobs-request))))

(defn list-training-jobs
  "Lists training jobs.

  list-training-jobs-request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest`

  returns: Result of the ListTrainingJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTrainingJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListTrainingJobsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest list-training-jobs-request]
    (-> this (.listTrainingJobs list-training-jobs-request))))

(defn waiters
  "returns: `com.amazonaws.services.sagemaker.waiters.AmazonSageMakerWaiters`"
  (^com.amazonaws.services.sagemaker.waiters.AmazonSageMakerWaiters [^AmazonSageMaker this]
    (-> this (.waiters))))

(defn delete-notebook-instance-lifecycle-config
  "Deletes a notebook instance lifecycle configuration.

  delete-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest`

  returns: Result of the DeleteNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest delete-notebook-instance-lifecycle-config-request]
    (-> this (.deleteNotebookInstanceLifecycleConfig delete-notebook-instance-lifecycle-config-request))))

(defn stop-notebook-instance
  "Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
   volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML
   compute instance when you call StopNotebookInstance.


   To access data on the ML storage volume for a notebook instance that has been terminated, call the
   StartNotebookInstance API. StartNotebookInstance launches another ML compute instance,
   configures it, and attaches the preserved ML storage volume so you can continue your work.

  stop-notebook-instance-request - `com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest`

  returns: Result of the StopNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest stop-notebook-instance-request]
    (-> this (.stopNotebookInstance stop-notebook-instance-request))))

(defn list-transform-jobs
  "Lists transform jobs.

  list-transform-jobs-request - `com.amazonaws.services.sagemaker.model.ListTransformJobsRequest`

  returns: Result of the ListTransformJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTransformJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListTransformJobsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTransformJobsRequest list-transform-jobs-request]
    (-> this (.listTransformJobs list-transform-jobs-request))))

(defn create-compilation-job
  "Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model
   artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.


   If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
   artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them
   as an ML resource.


   In the request body, you provide the following:




   A name for the compilation job




   Information about the input model artifacts




   The output location for the compiled model and the device (target) that the model runs on




   The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job




   You can also provide a Tag to track the model compilation job's resource use and costs. The response
   body contains the CompilationJobArn for the compiled job.


   To stop a model compilation job, use StopCompilationJob. To get information about a particular model
   compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use
   ListCompilationJobs.

  create-compilation-job-request - `com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest`

  returns: Result of the CreateCompilationJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateCompilationJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceInUseException - Resource being accessed is in use."
  (^com.amazonaws.services.sagemaker.model.CreateCompilationJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest create-compilation-job-request]
    (-> this (.createCompilationJob create-compilation-job-request))))

(defn list-training-jobs-for-hyper-parameter-tuning-job
  "Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job
   launched.

  list-training-jobs-for-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest`

  returns: Result of the ListTrainingJobsForHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest list-training-jobs-for-hyper-parameter-tuning-job-request]
    (-> this (.listTrainingJobsForHyperParameterTuningJob list-training-jobs-for-hyper-parameter-tuning-job-request))))

(defn delete-workteam
  "Deletes an existing work team. This operation can't be undone.

  delete-workteam-request - `com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest`

  returns: Result of the DeleteWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteWorkteamResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.DeleteWorkteamResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest delete-workteam-request]
    (-> this (.deleteWorkteam delete-workteam-request))))

(defn list-tags
  "Returns the tags for the specified Amazon SageMaker resource.

  list-tags-request - `com.amazonaws.services.sagemaker.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTagsResult`"
  (^com.amazonaws.services.sagemaker.model.ListTagsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn delete-endpoint
  "Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was
   created.


   Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use
   the RevokeGrant API call.

  delete-endpoint-request - `com.amazonaws.services.sagemaker.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteEndpointResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteEndpointResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpoint delete-endpoint-request))))

(defn update-notebook-instance
  "Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
   used for your notebook instance to accommodate changes in your workload requirements.

  update-notebook-instance-request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest`

  returns: Result of the UpdateNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest update-notebook-instance-request]
    (-> this (.updateNotebookInstance update-notebook-instance-request))))

(defn create-endpoint
  "Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
   to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig
   API.



   Use this API only for hosting models using Amazon SageMaker hosting services.


   You must not delete an EndpointConfig in use by an endpoint that is live or while the
   UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To
   update an endpoint, you must create a new EndpointConfig.



   The endpoint name must be unique within an AWS Region in your AWS account.


   When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute
   instances), and deploys the model(s) on them.


   When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it
   creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming
   requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API.


   For an example, see Exercise 1: Using the
   K-Means Algorithm Provided by Amazon SageMaker.


   If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
   Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
   IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
   for that region. For more information, see Activating and
   Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.

  create-endpoint-request - `com.amazonaws.services.sagemaker.model.CreateEndpointRequest`

  returns: Result of the CreateEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateEndpointResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.CreateEndpointResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateEndpointRequest create-endpoint-request]
    (-> this (.createEndpoint create-endpoint-request))))

(defn describe-model
  "Describes a model that you created using the CreateModel API.

  describe-model-request - `com.amazonaws.services.sagemaker.model.DescribeModelRequest`

  returns: Result of the DescribeModel operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeModelResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeModelResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeModelRequest describe-model-request]
    (-> this (.describeModel describe-model-request))))

(defn update-endpoint
  "Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint,
   and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is
   no availability loss).


   When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating
   the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.



   You must not delete an EndpointConfig in use by an endpoint that is live or while the
   UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To
   update an endpoint, you must create a new EndpointConfig.

  update-endpoint-request - `com.amazonaws.services.sagemaker.model.UpdateEndpointRequest`

  returns: Result of the UpdateEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateEndpointResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.UpdateEndpointResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateEndpointRequest update-endpoint-request]
    (-> this (.updateEndpoint update-endpoint-request))))

(defn create-transform-job
  "Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these
   results to an Amazon S3 location that you specify.


   To perform batch transformations, you create a transform job and use the data that you have readily available.


   In the request body, you provide the following:




   TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an
   AWS account.




   ModelName - Identifies the model to use. ModelName must be the name of an existing
   Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see
   CreateModel.




   TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is
   stored.




   TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
   results from the transform job.




   TransformResources - Identifies the ML compute instances for the transform job.




   For more information about how batch transformation works Amazon SageMaker, see How It Works.

  create-transform-job-request - `com.amazonaws.services.sagemaker.model.CreateTransformJobRequest`

  returns: Result of the CreateTransformJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateTransformJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceInUseException - Resource being accessed is in use."
  (^com.amazonaws.services.sagemaker.model.CreateTransformJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateTransformJobRequest create-transform-job-request]
    (-> this (.createTransformJob create-transform-job-request))))

(defn delete-algorithm
  "Removes the specified algorithm from your account.

  delete-algorithm-request - `com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest`

  returns: Result of the DeleteAlgorithm operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteAlgorithmResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteAlgorithmResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest delete-algorithm-request]
    (-> this (.deleteAlgorithm delete-algorithm-request))))

(defn create-training-job
  "Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an
   Amazon S3 location that you specify.


   If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
   artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon
   SageMaker, provided that you know how to use them for inferences.


   In the request body, you provide the following:




   AlgorithmSpecification - Identifies the training algorithm to use.




   HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model
   parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of
   hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.




   InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.




   OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
   results of model training.




   ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy
   for model training. In distributed training, you specify more than one instance.




   RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your
   behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
   successfully complete model training.




   StoppingCondition - Sets a time limit for training. Use this parameter to cap model training costs.




   For more information about Amazon SageMaker, see How It Works.

  create-training-job-request - `com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest`

  returns: Result of the CreateTrainingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateTrainingJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceInUseException - Resource being accessed is in use."
  (^com.amazonaws.services.sagemaker.model.CreateTrainingJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest create-training-job-request]
    (-> this (.createTrainingJob create-training-job-request))))

(defn create-algorithm
  "Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.

  create-algorithm-request - `com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest`

  returns: Result of the CreateAlgorithm operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateAlgorithmResult`"
  (^com.amazonaws.services.sagemaker.model.CreateAlgorithmResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest create-algorithm-request]
    (-> this (.createAlgorithm create-algorithm-request))))

(defn create-notebook-instance-lifecycle-config
  "Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle
   configuration is a collection of shell scripts that run when you create or start a notebook instance.


   Each lifecycle configuration script has a limit of 16384 characters.


   The value of the $PATH environment variable that is available to both scripts is
   /sbin:bin:/usr/sbin:/usr/bin.


   View CloudWatch Logs for notebook instance lifecycle configurations in log group
   /aws/sagemaker/NotebookInstances in log stream
   [notebook-instance-name]/[LifecycleConfigHook].


   Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes,
   it fails and the notebook instance is not created or started.


   For information about notebook instance lifestyle configurations, see Step 2.1: (Optional)
   Customize a Notebook Instance.

  create-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest`

  returns: Result of the CreateNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest create-notebook-instance-lifecycle-config-request]
    (-> this (.createNotebookInstanceLifecycleConfig create-notebook-instance-lifecycle-config-request))))

(defn describe-workteam
  "Gets information about a specific work team. You can see information such as the create date, the last updated
   date, membership information, and the work team's Amazon Resource Name (ARN).

  describe-workteam-request - `com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest`

  returns: Result of the DescribeWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeWorkteamResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest describe-workteam-request]
    (-> this (.describeWorkteam describe-workteam-request))))

(defn describe-subscribed-workteam
  "Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
   in the AWS Marketplace.

  describe-subscribed-workteam-request - `com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest`

  returns: Result of the DescribeSubscribedWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest describe-subscribed-workteam-request]
    (-> this (.describeSubscribedWorkteam describe-subscribed-workteam-request))))

(defn start-notebook-instance
  "Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
   After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
   InService. A notebook instance's status must be InService before you can connect to
   your Jupyter notebook.

  start-notebook-instance-request - `com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest`

  returns: Result of the StartNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest start-notebook-instance-request]
    (-> this (.startNotebookInstance start-notebook-instance-request))))

(defn list-algorithms
  "Lists the machine learning algorithms that have been created.

  list-algorithms-request - `com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest`

  returns: Result of the ListAlgorithms operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListAlgorithmsResult`"
  (^com.amazonaws.services.sagemaker.model.ListAlgorithmsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest list-algorithms-request]
    (-> this (.listAlgorithms list-algorithms-request))))

(defn delete-model-package
  "Deletes a model package.


   A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to
   model packages listed on AWS Marketplace to create models in Amazon SageMaker.

  delete-model-package-request - `com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest`

  returns: Result of the DeleteModelPackage operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteModelPackageResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteModelPackageResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest delete-model-package-request]
    (-> this (.deleteModelPackage delete-model-package-request))))

(defn stop-compilation-job
  "Stops a model compilation job.


   To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If
   the job hasn't stopped, it sends the SIGKILL signal.


   When it receives a StopCompilationJob request, Amazon SageMaker changes the
   CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker
   stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped.

  stop-compilation-job-request - `com.amazonaws.services.sagemaker.model.StopCompilationJobRequest`

  returns: Result of the StopCompilationJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopCompilationJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.StopCompilationJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopCompilationJobRequest stop-compilation-job-request]
    (-> this (.stopCompilationJob stop-compilation-job-request))))

(defn render-ui-template
  "Renders the UI template so that you can preview the worker's experience.

  render-ui-template-request - `com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest`

  returns: Result of the RenderUiTemplate operation returned by the service. - `com.amazonaws.services.sagemaker.model.RenderUiTemplateResult`"
  (^com.amazonaws.services.sagemaker.model.RenderUiTemplateResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest render-ui-template-request]
    (-> this (.renderUiTemplate render-ui-template-request))))

(defn create-labeling-job
  "Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to
   train machine learning models.


   You can select your workforce from one of three providers:




   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private
   workforce when want the data to stay within your organization or when a specific set of skills is required.




   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.




   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data
   or data that has been stripped of any personally identifiable information.




   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a
   human. Automated data labeling uses active learning to determine if a data object can be labeled by
   machine or if it needs to be sent to a human worker. For more information, see Using Automated Data
   Labeling.


   The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that
   describes the location of each object. For more information, see Using Input and Output Data.


   The output can be used as the manifest file for another labeling job or as training data for your machine
   learning models.

  create-labeling-job-request - `com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest`

  returns: Result of the CreateLabelingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateLabelingJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceInUseException - Resource being accessed is in use."
  (^com.amazonaws.services.sagemaker.model.CreateLabelingJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest create-labeling-job-request]
    (-> this (.createLabelingJob create-labeling-job-request))))

(defn stop-transform-job
  "Stops a transform job.


   When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to
   Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you
   stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.

  stop-transform-job-request - `com.amazonaws.services.sagemaker.model.StopTransformJobRequest`

  returns: Result of the StopTransformJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopTransformJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.StopTransformJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopTransformJobRequest stop-transform-job-request]
    (-> this (.stopTransformJob stop-transform-job-request))))

(defn stop-hyper-parameter-tuning-job
  "Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched.


   All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All
   data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning
   job moves to the Stopped state, it releases all reserved resources for the tuning job.

  stop-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest`

  returns: Result of the StopHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest stop-hyper-parameter-tuning-job-request]
    (-> this (.stopHyperParameterTuningJob stop-hyper-parameter-tuning-job-request))))

(defn describe-code-repository
  "Gets details about the specified Git repository.

  describe-code-repository-request - `com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest`

  returns: Result of the DescribeCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest describe-code-repository-request]
    (-> this (.describeCodeRepository describe-code-repository-request))))

(defn get-search-suggestions
  "An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
   possible matches for the property name to use in Search queries. Provides suggestions for
   HyperParameters, Tags, and Metrics.

  get-search-suggestions-request - `com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest`

  returns: Result of the GetSearchSuggestions operation returned by the service. - `com.amazonaws.services.sagemaker.model.GetSearchSuggestionsResult`"
  (^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest get-search-suggestions-request]
    (-> this (.getSearchSuggestions get-search-suggestions-request))))

(defn describe-notebook-instance-lifecycle-config
  "Returns a description of a notebook instance lifecycle configuration.


   For information about notebook instance lifestyle configurations, see Step 2.1: (Optional)
   Customize a Notebook Instance.

  describe-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest`

  returns: Result of the DescribeNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest describe-notebook-instance-lifecycle-config-request]
    (-> this (.describeNotebookInstanceLifecycleConfig describe-notebook-instance-lifecycle-config-request))))

(defn create-presigned-notebook-instance-url
  "Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
   console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing
   the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
   page.


   IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that
   attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that
   it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and
   the aws:SourceIP condition context key to specify the list of IP addresses that you want to have
   access to the notebook instance. For more information, see Limit Access to a Notebook Instance by
   IP Address.



   The URL that you get from a call to is valid only for 5 minutes. If you try to use the URL after the 5-minute
   limit expires, you are directed to the AWS console sign-in page.

  create-presigned-notebook-instance-url-request - `com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest`

  returns: Result of the CreatePresignedNotebookInstanceUrl operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult`"
  (^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest create-presigned-notebook-instance-url-request]
    (-> this (.createPresignedNotebookInstanceUrl create-presigned-notebook-instance-url-request))))

(defn create-notebook-instance
  "Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance
   running on a Jupyter notebook.


   In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run.
   Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model
   training, and attaches an ML storage volume to the notebook instance.


   Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker
   with a specific algorithm or with a machine learning framework.


   After receiving the request, Amazon SageMaker does the following:




   Creates a network interface in the Amazon SageMaker VPC.




   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC,
   which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon
   SageMaker attaches the security group that you specified in the request to the network interface that it creates
   in your VPC.




   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified
   SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this
   instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security
   groups allow it.




   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN).


   After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter
   notebooks. For example, you can write code to explore a dataset that you can use for model training, train a
   model, host models by creating Amazon SageMaker endpoints, and validate hosted models.


   For more information, see How It
   Works.

  create-notebook-instance-request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest`

  returns: Result of the CreateNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest create-notebook-instance-request]
    (-> this (.createNotebookInstance create-notebook-instance-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonSageMaker this]
    (-> this (.shutdown))))

(defn list-labeling-jobs
  "Gets a list of labeling jobs.

  list-labeling-jobs-request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest`

  returns: Result of the ListLabelingJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListLabelingJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListLabelingJobsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest list-labeling-jobs-request]
    (-> this (.listLabelingJobs list-labeling-jobs-request))))

(defn create-endpoint-config
  "Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
   configuration, you identify one or more models, created using the CreateModel API, to deploy and the
   resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.



   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.



   In the request, you define one or more ProductionVariants, each of which identifies a model. Each
   ProductionVariant parameter also describes the resources that you want Amazon SageMaker to
   provision. This includes the number and type of ML compute instances to deploy.


   If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you
   want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
   traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
   A, and one-third to model B.

  create-endpoint-config-request - `com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest`

  returns: Result of the CreateEndpointConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest create-endpoint-config-request]
    (-> this (.createEndpointConfig create-endpoint-config-request))))

(defn create-model-package
  "Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can
   subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.


   To create a model package by specifying a Docker container that contains your inference code and the Amazon S3
   location of your model artifacts, provide values for InferenceSpecification. To create a model from
   an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for
   SourceAlgorithmSpecification.

  create-model-package-request - `com.amazonaws.services.sagemaker.model.CreateModelPackageRequest`

  returns: Result of the CreateModelPackage operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateModelPackageResult`"
  (^com.amazonaws.services.sagemaker.model.CreateModelPackageResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateModelPackageRequest create-model-package-request]
    (-> this (.createModelPackage create-model-package-request))))

(defn create-code-repository
  "Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
   notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
   resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
   persists independently from the lifecycle of any notebook instances it is associated with.


   The repository can be hosted either in AWS CodeCommit or in any other Git
   repository.

  create-code-repository-request - `com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest`

  returns: Result of the CreateCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest create-code-repository-request]
    (-> this (.createCodeRepository create-code-repository-request))))

(defn create-hyper-parameter-tuning-job
  "Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
   training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
   you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
   by an objective metric that you choose.

  create-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest`

  returns: Result of the CreateHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceInUseException - Resource being accessed is in use."
  (^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest create-hyper-parameter-tuning-job-request]
    (-> this (.createHyperParameterTuningJob create-hyper-parameter-tuning-job-request))))

(defn create-model
  "Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
   primary container, you specify the docker image containing inference code, artifacts (from prior training), and
   custom environment map that the inference code uses when you deploy the model for predictions.


   Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job.


   To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then
   create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers
   that you defined for the model in the hosting environment.


   To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon
   SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location.


   In the CreateModel request, you must define a container with the PrimaryContainer
   parameter.


   In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and
   docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also
   use the IAM role to manage permissions the inference code needs. For example, if the inference code access any
   other AWS resources, you grant necessary permissions via this role.

  create-model-request - `com.amazonaws.services.sagemaker.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateModelResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.CreateModelResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateModelRequest create-model-request]
    (-> this (.createModel create-model-request))))

(defn list-endpoint-configs
  "Lists endpoint configurations.

  list-endpoint-configs-request - `com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest`

  returns: Result of the ListEndpointConfigs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult`"
  (^com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest list-endpoint-configs-request]
    (-> this (.listEndpointConfigs list-endpoint-configs-request))))

(defn describe-labeling-job
  "Gets information about a labeling job.

  describe-labeling-job-request - `com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest`

  returns: Result of the DescribeLabelingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeLabelingJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.DescribeLabelingJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest describe-labeling-job-request]
    (-> this (.describeLabelingJob describe-labeling-job-request))))

(defn list-notebook-instance-lifecycle-configs
  "Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig
   API.

  list-notebook-instance-lifecycle-configs-request - `com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest`

  returns: Result of the ListNotebookInstanceLifecycleConfigs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult`"
  (^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest list-notebook-instance-lifecycle-configs-request]
    (-> this (.listNotebookInstanceLifecycleConfigs list-notebook-instance-lifecycle-configs-request))))

(defn describe-endpoint
  "Returns the description of an endpoint.

  describe-endpoint-request - `com.amazonaws.services.sagemaker.model.DescribeEndpointRequest`

  returns: Result of the DescribeEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeEndpointResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeEndpointResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeEndpointRequest describe-endpoint-request]
    (-> this (.describeEndpoint describe-endpoint-request))))

(defn update-notebook-instance-lifecycle-config
  "Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig
   API.

  update-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest`

  returns: Result of the UpdateNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest update-notebook-instance-lifecycle-config-request]
    (-> this (.updateNotebookInstanceLifecycleConfig update-notebook-instance-lifecycle-config-request))))

(defn list-labeling-jobs-for-workteam
  "Gets a list of labeling jobs assigned to a specified work team.

  list-labeling-jobs-for-workteam-request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest`

  returns: Result of the ListLabelingJobsForWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest list-labeling-jobs-for-workteam-request]
    (-> this (.listLabelingJobsForWorkteam list-labeling-jobs-for-workteam-request))))

(defn delete-notebook-instance
  "Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the
   StopNotebookInstance API.



   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance,
   and deletes the ML storage volume and the network interface associated with the notebook instance.

  delete-notebook-instance-request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest`

  returns: Result of the DeleteNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest delete-notebook-instance-request]
    (-> this (.deleteNotebookInstance delete-notebook-instance-request))))

(defn stop-labeling-job
  "Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
   stopped are placed in the Amazon S3 output bucket.

  stop-labeling-job-request - `com.amazonaws.services.sagemaker.model.StopLabelingJobRequest`

  returns: Result of the StopLabelingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopLabelingJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.StopLabelingJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopLabelingJobRequest stop-labeling-job-request]
    (-> this (.stopLabelingJob stop-labeling-job-request))))

(defn update-code-repository
  "Updates the specified Git repository with the specified values.

  update-code-repository-request - `com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest`

  returns: Result of the UpdateCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest update-code-repository-request]
    (-> this (.updateCodeRepository update-code-repository-request))))

(defn describe-transform-job
  "Returns information about a transform job.

  describe-transform-job-request - `com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest`

  returns: Result of the DescribeTransformJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeTransformJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.DescribeTransformJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest describe-transform-job-request]
    (-> this (.describeTransformJob describe-transform-job-request))))

(defn list-compilation-jobs
  "Lists model compilation jobs that satisfy various filters.


   To create a model compilation job, use CreateCompilationJob. To get information about a particular model
   compilation job you have created, use DescribeCompilationJob.

  list-compilation-jobs-request - `com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest`

  returns: Result of the ListCompilationJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListCompilationJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListCompilationJobsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest list-compilation-jobs-request]
    (-> this (.listCompilationJobs list-compilation-jobs-request))))

(defn delete-model
  "Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon
   SageMaker when you called the CreateModel API. It does not
   delete model artifacts, inference code, or the IAM role that you specified when creating the model.

  delete-model-request - `com.amazonaws.services.sagemaker.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteModelResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteModelResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteModelRequest delete-model-request]
    (-> this (.deleteModel delete-model-request))))

(defn delete-code-repository
  "Deletes the specified Git repository from your account.

  delete-code-repository-request - `com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest`

  returns: Result of the DeleteCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest delete-code-repository-request]
    (-> this (.deleteCodeRepository delete-code-repository-request))))

(defn list-code-repositories
  "Gets a list of the Git repositories in your account.

  list-code-repositories-request - `com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest`

  returns: Result of the ListCodeRepositories operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListCodeRepositoriesResult`"
  (^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest list-code-repositories-request]
    (-> this (.listCodeRepositories list-code-repositories-request))))

(defn describe-model-package
  "Returns a description of the specified model package, which is used to create Amazon SageMaker models or list
   them on AWS Marketplace.


   To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.

  describe-model-package-request - `com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest`

  returns: Result of the DescribeModelPackage operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeModelPackageResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeModelPackageResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest describe-model-package-request]
    (-> this (.describeModelPackage describe-model-package-request))))

(defn describe-notebook-instance
  "Returns information about a notebook instance.

  describe-notebook-instance-request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest`

  returns: Result of the DescribeNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest describe-notebook-instance-request]
    (-> this (.describeNotebookInstance describe-notebook-instance-request))))

(defn update-workteam
  "Updates an existing work team with new member definitions or description.

  update-workteam-request - `com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest`

  returns: Result of the UpdateWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateWorkteamResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceLimitExceededException - You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs created."
  (^com.amazonaws.services.sagemaker.model.UpdateWorkteamResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest update-workteam-request]
    (-> this (.updateWorkteam update-workteam-request))))

(defn describe-endpoint-config
  "Returns the description of an endpoint configuration created using the CreateEndpointConfig API.

  describe-endpoint-config-request - `com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest`

  returns: Result of the DescribeEndpointConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest describe-endpoint-config-request]
    (-> this (.describeEndpointConfig describe-endpoint-config-request))))

(defn describe-hyper-parameter-tuning-job
  "Gets a description of a hyperparameter tuning job.

  describe-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest`

  returns: Result of the DescribeHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest describe-hyper-parameter-tuning-job-request]
    (-> this (.describeHyperParameterTuningJob describe-hyper-parameter-tuning-job-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSageMaker this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-notebook-instances
  "Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.

  list-notebook-instances-request - `com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest`

  returns: Result of the ListNotebookInstances operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult`"
  (^com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest list-notebook-instances-request]
    (-> this (.listNotebookInstances list-notebook-instances-request))))

(defn search
  "Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of
   SearchResult objects in the response. You can sort the search results by any resource property in a
   ascending or descending order.


   You can query against the following value types: numerical, text, Booleans, and timestamps.

  search-request - `com.amazonaws.services.sagemaker.model.SearchRequest`

  returns: Result of the Search operation returned by the service. - `com.amazonaws.services.sagemaker.model.SearchResult`"
  (^com.amazonaws.services.sagemaker.model.SearchResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.SearchRequest search-request]
    (-> this (.search search-request))))

(defn describe-training-job
  "Returns information about a training job.

  describe-training-job-request - `com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest`

  returns: Result of the DescribeTrainingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest describe-training-job-request]
    (-> this (.describeTrainingJob describe-training-job-request))))

(defn stop-training-job
  "Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which
   delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts,
   so the results of the training is not lost.


   When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to
   Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.

  stop-training-job-request - `com.amazonaws.services.sagemaker.model.StopTrainingJobRequest`

  returns: Result of the StopTrainingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopTrainingJobResult`

  throws: com.amazonaws.services.sagemaker.model.ResourceNotFoundException - Resource being access is not found."
  (^com.amazonaws.services.sagemaker.model.StopTrainingJobResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopTrainingJobRequest stop-training-job-request]
    (-> this (.stopTrainingJob stop-training-job-request))))

(defn list-subscribed-workteams
  "Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
   team satisfies the filter specified in the NameContains parameter.

  list-subscribed-workteams-request - `com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest`

  returns: Result of the ListSubscribedWorkteams operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsResult`"
  (^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest list-subscribed-workteams-request]
    (-> this (.listSubscribedWorkteams list-subscribed-workteams-request))))

(defn list-models
  "Lists models created with the CreateModel API.

  list-models-request - `com.amazonaws.services.sagemaker.model.ListModelsRequest`

  returns: Result of the ListModels operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListModelsResult`"
  (^com.amazonaws.services.sagemaker.model.ListModelsResult [^AmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListModelsRequest list-models-request]
    (-> this (.listModels list-models-request))))

