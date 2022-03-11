
resource "time_sleep" "wait_for_install" {
  create_duration = "60s"
}

data "kubernetes_secret" "secret" {
  metadata {
    name      = var.name
    namespace = var.namespace
  }

  time_sleep = [time_sleep.wait_for_install]
}
