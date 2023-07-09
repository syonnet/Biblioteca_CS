// function eliminar(id) {
//     Swal.fire({
//         title: '¿Esta seguro de eliminar?',
//         text: "¡No podrás revertir esto!",
//         icon: 'warning',
//         showCancelButton: true,
//         confirmButtonColor: '#3085d6',
//         cancelButtonColor: '#d33',
//         confirmButtonText: 'Si'
//     }).then((result) => {
//         if (result.isConfirmed) {
//             $.ajax({
//                 url: "/deleteLibro/" + id,
//                 success: function (resp) {
//                     console.log(res);
//                 }
//             })
//             Swal.fire(
//                 '¡Eliminado!',
//                 'Su registro ha sido eliminado.',
//                 'success'
//             ).then((OK) => {
//                 if (OK) {
//                     location.href = "/listLibro";
//                 }
//             });
//         }
//     })
// }